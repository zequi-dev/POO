#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Nodo {
    char* palabra;
    struct Nodo* siguiente;
    struct Nodo* anterior;
} Nodo;

typedef struct {
    Nodo* Cabeza;
} ListaDoble;

Nodo* CrearNodo(char* palabra);
ListaDoble* crearListaDoble();
void PushFront(ListaDoble* lista, char* palabra);
void PushBack(ListaDoble* lista, char* palabra);
void PushPos(ListaDoble* lista, char* palabra, int pos);
void ImprimirLista(ListaDoble* lista);
void LiberarLista(ListaDoble* lista);

// Funciones para la pila
void push(ListaDoble* pila, char* palabra) {
    PushFront(pila, palabra); // Usamos PushFront para agregar el nuevo nodo al frente
}

char* pop(ListaDoble* pila) {
    if (estaVacia(pila)) {
        return NULL; // Pila vacía
    }
    Nodo* nodoRemovido = pila->Cabeza; // Nodo a eliminar
    char* palabra = nodoRemovido->palabra;

    if (nodoRemovido->siguiente == nodoRemovido) {
        // Solo hay un elemento
        pila->Cabeza = NULL;
    } else {
        Nodo* ultimo = nodoRemovido->anterior;
        pila->Cabeza = nodoRemovido->siguiente;
        pila->Cabeza->anterior = ultimo;
        ultimo->siguiente = pila->Cabeza;
    }

    free(nodoRemovido); // Liberar el nodo
    return palabra; // Retornar la palabra
}

char* peek(ListaDoble* pila) {
    if (estaVacia(pila)) {
        return NULL; // Pila vacía
    }
    return pila->Cabeza->palabra; // Retornar la palabra en la cima de la pila
}

int estaVacia(ListaDoble* pila) {
    return pila->Cabeza == NULL; // Retorna 1 si está vacía, 0 si no
}

void printPila(ListaDoble* pila) {
    ImprimirLista(pila); // Usamos la función de imprimir lista ya definida
}


