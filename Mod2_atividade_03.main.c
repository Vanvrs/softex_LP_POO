int * pt; //declara��o do ponteiro para armazenar o endere�o do bloco alocado

pt = (int *) malloc(22*sizeof(int)); //chamada da fun��o malloc para reservar espa�o para 22 elementos do tipo int

if (pt == NULL)
{
   //mem�ria insuficiente
}
else
{
    pt = (int *) realloc(pt, 22*sizeof(int)); //chama a fun��o realloc para reservar espa�o para mais 22 elementos

    if (pt == NULL)
    {
      //mem�ria insuficiente
    }
}

free(pt); //chama a fun��o free para liberar o bloco indicado por pt
pt = NULL; //atribui NULL para indicar que o ponteiro n�o tem um endere�o v�lido
