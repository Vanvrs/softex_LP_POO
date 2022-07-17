# Desenvolva um código que simule uma eleição com três candidatos.
# - candidato_X => 889
# - candidato_Y => 847
# - candidato_Z => 515
# - branco => 0

# O código deve perguntar se deseja finalizar a votação depois 
# do voto. Caso o número do voto não corresponda a nenhum 
# candidato ou seja branco, ele deve ser tratado como nulo. 
# Se for inserido um texto ao invés de número, o código deve
# retornar uma mensagem para votar novamente.

# Quando a votação for finalizada, o código deverá mostrar
# o vencedor, aquele com o maior número de votos e, também, 
# a quantidade de votos de cada candidato, os brancos e nulos 

def votacao(candidato):  # fução para votação com a variavel candidato como argumento
    global candidato_X, candidato_Y, candidato_Z, candidato_Branco

    if candidato.isalpha():  # checa se candidato contem apenas letras
        if candidato == 'Fim' or candidato == 'fim' or candidato == 'FIM':
            print('FIM DA VOTAÇÃO')
            print_resultados()

    elif candidato.isnumeric():  # checa se candidato e um caracter numerico
        if candidato == '889' or candidato == '847' or candidato == '515' or candidato_Branco == '0':
            if candidato == '889':
                candidato_X += 1
            elif candidato == '847':
                 candidato_Y += 1
            elif candidato == '515':
                 candidato_Z += 1
            elif candidato == '0':
                 candidato_Branco += 1   
        else:  # se o valor digitado nao e válido, há entrada de novo candidato e a funcao repete
            candidato= str(input('Digite um numero valido para o candidato: '))
            votacao(candidato)
  

def print_resultados():  # Mostra resultados e encerra programa
    global candidato_X, candidato_Y, candidato_Z, candidato_Branco

    print('QUANTIDADE DE VOTOS:\n')
    print('CANDIDATO_X - TOTAL DE ' + str(candidato_X))
    print('CANDIDATO_Y - TOTAL DE ' + str(candidato_Y))
    print('CANDIDATO_Z - TOTAL DE ' + str(candidato_Z))
    print('CANDIDATO_BRANCO - TOTAL DE ' + str(candidato_Branco))

    exit()  # encerra prog


if __name__ == '__main__':  # funcao main 
    candidato_X = 0
    candidato_Y = 0
    candidato_Z = 0
    candidato_Branco = 0

    while True:  # laço ocorre indefinidamente ate que ocorra o 'Fim'
        candidato = str(input('VOTAÇÃO\nDigite o numero do seu candidato: '))
        votacao(candidato)