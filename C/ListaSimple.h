#pragma once

typedef struct Nodo{
    char valor;
    struct Nodo* siguiente;
} Nodo;

typedef struct ListaSimple{
    Nodo* Cabeza;
    Nodo* Cola;
} ListaSimple;

void Pushfront(ListaSimple *lista, char valor);
void PushBack(ListaSimple *lista, char valor);
void PushPos(ListaSimple *lista, int pos, char valor);
void ImprimirLista(ListaSimple *lista);
char ObtenerCabeza(ListaSimple *lista);
char ObtenerCola(ListaSimple *lista);
