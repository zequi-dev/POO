#include <stdio.h>
#include "ListaSimple.h"

int main() {
    ListaSimple lista = {NULL, NULL};

    Pushfront(&lista, 'U');  
    Pushfront(&lista, 'A'); 
    PushBack(&lista, 'B');   
    PushBack(&lista, 'C');   
    Pushfront(&lista, 'I');  
    PushPos(&lista, 5, 'S');
    PushPos(&lista, 0, 'T');
    PushPos(&lista, 3, 'E');

    printf("Lista final: ");
    ImprimirLista(&lista);

    printf("Cabeza: %c\n", ObtenerCabeza(&lista));
    printf("Cola: %c\n", ObtenerCola(&lista));

    return 0;
}
