banderas = -Wall -Werror -pedantic -std=c99
folders = -Ilib/h/IOF -Ilib/h/Listas
lib = -llista_doble
libfolder = -Llib/s

SRC = examen.c
OBJ = examen.o

examen:
	gcc $(banderas) examen.c -o examen $(folders) $(libfolder) $(lib)

$(OBJ): $(SRC)
	gcc $(banderas) -c $(SRC) $(folders)