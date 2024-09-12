
banderas = -Wall -Werror -pedantic -std=c99
folders = -Ilib/h/IOF -Ilib/h/Listas
lib = -llista_doble
libfolder = -Llib/s

SRC = examen.c
OBJ = examen.o
LIB_SRC = lib/s/liblista_doble.c
LIB_OBJ = lib/s/liblista_doble.o

examen: $(OBJ)
	gcc $(banderas) $(OBJ) -o examen $(folders) $(libfolder) $(lib)

clean:
	rm -f $(OBJ) examen
