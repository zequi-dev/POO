#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Ejemplo de uso
int main() {
    ListaDoble* pila = crearListaDoble();

    push(pila, "primero");
    push(pila, "segundo");
    push(pila, "tercero");

    printf("Elementos en la pila: ");
    printPila(pila); // Imprime la pila

    printf("Elemento en la cima: %s\n", peek(pila)); // Muestra el elemento en la cima

    printf("Sacando elemento: %s\n", pop(pila)); // Saca el elemento en la cima
    printf("Elementos en la pila después del pop: ");
    printPila(pila); // Imprime la pila

    LiberarLista(pila); // Liberar memoria al final
    return 0;
}