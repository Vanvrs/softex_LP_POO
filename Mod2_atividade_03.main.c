int * pt; //declaração do ponteiro para armazenar o endereço do bloco alocado

pt = (int *) malloc(22*sizeof(int)); //chamada da função malloc para reservar espaço para 22 elementos do tipo int

if (pt == NULL)
{
   //memória insuficiente
}
else
{
    pt = (int *) realloc(pt, 22*sizeof(int)); //chama a função realloc para reservar espaço para mais 22 elementos

    if (pt == NULL)
    {
      //memória insuficiente
    }
}

free(pt); //chama a função free para liberar o bloco indicado por pt
pt = NULL; //atribui NULL para indicar que o ponteiro não tem um endereço válido
