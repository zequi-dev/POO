#include "ListaDoble.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

Nodo* CrearNodo() {
    Nodo* nuevo = (Nodo*)malloc(sizeof(Nodo));
    if (nuevo == NULL) {
        return NULL;
    }
    nuevo->data.usuario[0] = '\0';
    nuevo->data.comentario[0] = '\0'; 
    nuevo->siguiente = NULL;
    nuevo->anterior = NULL;
    return nuevo;
}

void PushFront(ListaDoble* lista, Blog blog) {
    Nodo* NuevoNodo = CrearNodo();
    if (NuevoNodo == NULL) {
        return;
    }
    NuevoNodo->data = blog;
    if (lista->Cabeza == NULL) {
        lista->Cabeza = lista->Cola = NuevoNodo;
    } else {
        NuevoNodo->siguiente = lista->Cabeza;
        lista->Cabeza->anterior = NuevoNodo;
        lista->Cabeza = NuevoNodo;
    }
}

void PushBack(ListaDoble* lista, Blog blog) {
    Nodo* NuevoNodo = CrearNodo();
    if (NuevoNodo == NULL) {
        return;
    }
    NuevoNodo->data = blog;
    if (lista->Cabeza == NULL) {
        lista->Cabeza = lista->Cola = NuevoNodo;
    } else {
        lista->Cola->siguiente = NuevoNodo;
        NuevoNodo->anterior = lista->Cola;
        lista->Cola = NuevoNodo;
    }
}

void ImprimirLista(ListaDoble* lista) {
    Nodo* actual = lista->Cabeza;
    while (actual != NULL) {
        printf("Usuario: %s, Comentario: %s\n", actual->data.usuario, actual->data.comentario);
        actual = actual->siguiente;
    }
    printf("\n");
}

void ImprimirListaReversa(ListaDoble* lista) {
    Nodo* actual = lista->Cola;
    while (actual != NULL) {
        printf("Usuario: %s, Comentario: %s\n", actual->data.usuario, actual->data.comentario);
        actual = actual->anterior;
    }
    printf("\n");
}

void LiberarLista(ListaDoble* lista) {
    Nodo* actual = lista->Cabeza;
    while (actual != NULL) {
        Nodo* temp = actual;
        actual = actual->siguiente;
        free(temp);
    }
    lista->Cabeza = lista->Cola = NULL;
}

void GenerarUsuarioAleatorio(char* usuario) {
    int len = rand() % 6 + 1;  
    for (int i = 0; i < len; i++) {
        usuario[i] = 'a' + rand() % 26;
    }
    usuario[len] = '\0';
}

void GenerarComentarioAleatorio(char* comentario) {
    int len = rand() % 253 + 1;  
    for (int i = 0; i < len; i++) {
        comentario[i] = 'a' + rand() % 26;
    }
    comentario[len] = '\0';
}

void GenerarComentarios(ListaDoble* lista, int numComentarios) {
    if (lista == NULL) return;
    for (int i = 0; i < numComentarios; i++) {
        Blog nuevoComentario;
        GenerarUsuarioAleatorio(nuevoComentario.usuario);
        GenerarComentarioAleatorio(nuevoComentario.comentario);
        PushBack(lista, nuevoComentario);
    }
}


void OrdenarPorLongitudComentario(ListaDoble* lista) {
    if (lista->Cabeza == NULL) return;

    for (Nodo* i = lista->Cabeza; i != NULL; i = i->siguiente) {
        for (Nodo* j = i->siguiente; j != NULL; j = j->siguiente) {
            if (strlen(i->data.comentario) > strlen(j->data.comentario)) {
                Blog temp = i->data;
                i->data = j->data;
                j->data = temp;
            }
        }
    }
}


//CADA COMENTARIO FILTRADO MANDARLO A OTRA LISTA, NO ELIMINARLO
void FiltrarComentariosCortos(ListaDoble* lista, unsigned int longitudMinima) {
    if (lista == NULL || lista->Cabeza == NULL) return;

    Nodo* actual = lista->Cabeza;
    while (actual != NULL) {
        Nodo* siguiente = actual->siguiente;

        if (strlen(actual->data.comentario) < longitudMinima) {
            if (actual->anterior != NULL) {
                actual->anterior->siguiente = actual->siguiente;
            } else {
                lista->Cabeza = actual->siguiente;
            }

            if (actual->siguiente != NULL) {
                actual->siguiente->anterior = actual->anterior;
            } else {
                lista->Cola = actual->anterior;
            }

            free(actual);
        }

        actual = siguiente;
    }
}

void EliminarUsuariosLargos(ListaDoble* lista) {
    Nodo* actual = lista->Cabeza;
    while (actual != NULL) {
        Nodo* siguiente = actual->siguiente;
        if (strlen(actual->data.usuario) > 3) {
            if (actual->anterior) {
                actual->anterior->siguiente = actual->siguiente;
            } else {
                lista->Cabeza = actual->siguiente; 
            }
            if (actual->siguiente) {
                actual->siguiente->anterior = actual->anterior;
            } else {
                lista->Cola = actual->anterior; 
            }
            free(actual);
        }
        actual = siguiente;
    }
}
