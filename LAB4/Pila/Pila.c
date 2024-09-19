#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include "Pila.h"

Nodo* CrearNodo(char* palabra) {
    Nodo* nuevo = (Nodo*)malloc(sizeof(Nodo));
    if (nuevo == NULL) return NULL;
    
    nuevo->palabra = (char*)malloc(strlen(palabra) + 1);
    if (nuevo->palabra == NULL) {
        free(nuevo);
        return NULL;
    }
    strcpy(nuevo->palabra, palabra);
    
    nuevo->siguiente = NULL;
    nuevo->anterior = NULL;
    return nuevo;
}

ListaDoble* crearListaDoble() {
    ListaDoble* lista = (ListaDoble*)malloc(sizeof(ListaDoble));
    lista->Cabeza = NULL;
    return lista;
}

void PushFront(ListaDoble* lista, char* palabra) {
    Nodo* NuevoNodo = CrearNodo(palabra);
    if (NuevoNodo == NULL) return;
    if (lista->Cabeza == NULL) {
        NuevoNodo->siguiente = NuevoNodo;
        NuevoNodo->anterior = NuevoNodo;
        lista->Cabeza = NuevoNodo;
    } else {
        Nodo* ultimo = lista->Cabeza->anterior;
        NuevoNodo->siguiente = lista->Cabeza;
        NuevoNodo->anterior = ultimo;
        lista->Cabeza->anterior = NuevoNodo;
        ultimo->siguiente = NuevoNodo;
        lista->Cabeza = NuevoNodo;
    }
}

void PushBack(ListaDoble* lista, char* palabra) {
    Nodo* NuevoNodo = CrearNodo(palabra);
    if (NuevoNodo == NULL) return;
    if (lista->Cabeza == NULL) {
        NuevoNodo->siguiente = NuevoNodo;
        NuevoNodo->anterior = NuevoNodo;
        lista->Cabeza = NuevoNodo;
    } else {
        Nodo* ultimo = lista->Cabeza->anterior;
        NuevoNodo->siguiente = lista->Cabeza;
        NuevoNodo->anterior = ultimo;
        lista->Cabeza->anterior = NuevoNodo;
        ultimo->siguiente = NuevoNodo;
    }
}

void PushPos(ListaDoble* lista, char* palabra, int pos) {
    if (pos < 0) return; 
    Nodo* NuevoNodo = CrearNodo(palabra);
    if (NuevoNodo == NULL) {
        return;
    }

    if (lista->Cabeza == NULL || pos == 0) {
        PushFront(lista, palabra);
        return;
    }

    Nodo* actual = lista->Cabeza;
    int i;
    for (i = 0; i < pos - 1 && actual->siguiente != lista->Cabeza; ++i) {
        actual = actual->siguiente;
    }

    if (actual->siguiente == lista->Cabeza) {
        PushBack(lista, palabra);
    } else {
        Nodo* siguiente = actual->siguiente;
        NuevoNodo->siguiente = siguiente;
        NuevoNodo->anterior = actual;
        actual->siguiente = NuevoNodo;
        siguiente->anterior = NuevoNodo;
    }
}

void ImprimirLista(ListaDoble* lista) {
    if (lista->Cabeza == NULL) {
        printf("Lista vacía.\n");
        return;
    }
    Nodo* actual = lista->Cabeza;
    do {
        printf("%s ", (char *)actual->palabra);
        actual = actual->siguiente;
    } while (actual != lista->Cabeza);
    printf("\n");
}

void LiberarLista(ListaDoble* lista) {
    if (lista->Cabeza == NULL) return;

    Nodo* actual = lista->Cabeza;
    Nodo* siguiente;
    do {
        siguiente = actual->siguiente;
        free(actual->palabra);
        free(actual);
        actual = siguiente;
    } while (actual != lista->Cabeza);
    free(lista);
}


void push(ListaDoble* pila, char* palabra) {
    PushFront(pila, palabra);
}

char* pop(ListaDoble* pila) {
    if (estaVacia(pila)) {
        return NULL;
    }
    Nodo* nodoRemovido = pila->Cabeza;
    char* palabra = nodoRemovido->palabra;

    if (nodoRemovido->siguiente == nodoRemovido) {
        pila->Cabeza = NULL;
    } else {
        Nodo* ultimo = nodoRemovido->anterior;
        pila->Cabeza = nodoRemovido->siguiente;
        pila->Cabeza->anterior = ultimo;
        ultimo->siguiente = pila->Cabeza;
    }

    free(nodoRemovido);
    return palabra;
}

char* peek(ListaDoble* pila) {
    if (estaVacia(pila)) {
        return NULL; 
    }
    return pila->Cabeza->palabra; 
}

int estaVacia(ListaDoble* pila) {
    return pila->Cabeza == NULL;
}

void printPila(ListaDoble* pila) {
    ImprimirLista(pila); 
}

void inicializarMatrices(int** A, int** B, int size) {
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            A[i][j] = rand() % 10; // Números aleatorios entre 0 y 9
            B[i][j] = rand() % 10;
        }
    }
}

int** ProdSum(int** A, int** B, int size) {
    int** result = (int**)malloc(size * sizeof(int*));
    for (int i = 0; i < size; i++) {
        result[i] = (int*)malloc(size * sizeof(int));
        for (int j = 0; j < size; j++) {
            result[i][j] = A[i][j] + B[i][j]; // Producto suma (suma en este caso)
        }
    }
    return result;
}

void liberarMatriz(int** matriz, int size) {
    for (int i = 0; i < size; i++) {
        free(matriz[i]);
    }
    free(matriz);
}

void imprimirMatrizFinal(int** matriz, int size) {
    for (int i = 0; i < size; i++) {
        printf("[ ");
        for (int j = 0; j < size; j++) {
            printf("%3d ", matriz[i][j]);
        }
        printf("]\n");
    }
}
