#pragma once

typedef struct _BLOG {
    char usuario[30];
    char comentario[255];
} Blog;

typedef struct Nodo {
    Blog data;
    struct Nodo* siguiente;
    struct Nodo* anterior;
} Nodo;

typedef struct ListaDoble {
    Nodo* Cabeza;
    Nodo* Cola;
} ListaDoble;

void PushFront(ListaDoble* lista, Blog blog);
void EliminarUsuariosLargos(ListaDoble* lista);
void FiltrarComentariosCortos(ListaDoble* lista, unsigned int longitudMinima);
void OrdenarPorLongitudComentario(ListaDoble* lista);
void GenerarComentarios(ListaDoble* lista, int numComentarios);
void GenerarComentarioAleatorio(char* comentario);
void GenerarUsuarioAleatorio(char* usuario);
void LiberarLista(ListaDoble* lista);
void ImprimirListaReversa(ListaDoble* lista);
void ImprimirLista(ListaDoble* lista);
void PushBack(ListaDoble* lista, Blog blog);
