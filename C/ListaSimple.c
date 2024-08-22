#include <stdio.h>
#include <stdlib.h>
#include "ListaSimple.h"

Nodo* CrearNodo(char valor){
    Nodo* NuevoNodo = (Nodo*)malloc(sizeof(Nodo));
        NuevoNodo ->valor = valor;
        NuevoNodo ->siguiente = NULL;
        return NuevoNodo;
}

void Pushfront(ListaSimple *lista, char valor){
    Nodo* NuevoNodo = CrearNodo(valor);
        if (lista->Cabeza == NULL){
            lista->Cabeza = lista->Cola = NuevoNodo;
        } else {
            NuevoNodo->siguiente = lista->Cabeza;
                lista->Cabeza = NuevoNodo;
        }
}

void PushBack(ListaSimple *lista, char valor){
     Nodo* NuevoNodo = CrearNodo(valor);
        if (lista->Cabeza == NULL){
            lista->Cabeza = lista->Cola = NuevoNodo;
        } else {
            NuevoNodo->siguiente = lista->Cola;
                lista->Cola = NuevoNodo;
        }
}

void PushPos(ListaSimple *lista, int pos, char valor){
    if(pos = 0){
        PushFront(lista, valor);  
        return;
    }

    Nodo* actual = lista->Cabeza;
    int contador = 0;

    while (actual != NULL && contador < pos - 1) {
        actual = actual->siguiente;
        contador++;
    }

    if (actual == NULL) {
        PushBack(lista, valor);
        return;
    } else {
        Nodo* NuevoNodo = CrearNodo(valor);
        NuevoNodo->siguiente = actual->siguiente;
            actual->siguiente = NuevoNodo;
            if (NuevoNodo->siguiente == NULL){
                lista->Cola = NuevoNodo;
            }
    }
}

void ImprimirLista(ListaSimple *lista){
    Nodo* actual = lista->Cabeza;
    while (actual != NULL){
        print("%c", actual->valor);
        actual = actual->siguiente;
    }
}

void ObtenerCabeza(ListaSimple *lista){
    
}

void ObtenerCola(ListaSimple *lista){
    
}