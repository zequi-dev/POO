#pragma once

typedef struct Nodo {
    char* palabra;              
    struct Nodo* siguiente;    
    struct Nodo* anterior;      
} Nodo;

typedef struct ListaDoble {
    Nodo* Cabeza;
    Nodo* Cola;
} ListaDoble;


void imprimirLOG(ListaDoble* log[], size_t* longitudes, size_t numListas); 
char** SepCadenas(const char* str, size_t* numpalabras);
ListaDoble* filtro(const char* texto, size_t longitud);
ListaDoble* crearListaDoble();
void PushFront(ListaDoble* lista, char* palabra);
void PushBack(ListaDoble* lista, char* palabra);
void PushPos(ListaDoble* lista, char* palabra, int pos);
void ImprimirLista(ListaDoble* lista);
void LiberarLista(ListaDoble* lista);
