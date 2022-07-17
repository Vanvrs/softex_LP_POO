# Desenvolva um programa que deve ler um arquivo csv intitulado “notas_alunos.csv”. 
# O arquivo deve ter a seguinte estrutura:

# aluno: Nome do aluno;
# nota_1: Primeira nota;
# nota_2: Segunda nota;
# faltas: Número de faltas;

# O programa lerá esse arquivo e criará duas colunas. A primeira coluna
# será “media”, que terá a média das duas notas do aluno. A segunda será 
# “situacao”, com os valores: APROVADO ou REPROVADO.

# O aluno que tiver mais de 5 faltas ou possuir média menor que sete, 
# será reprovado. O programa deverá salvar esse novo dataframe
# com o nome “alunos_situacao.csv”.

# Por fim, o programa deverá mostrar na tela:
# - o maior número de faltas;
# - a média geral das notas dos alunos;
# - e a maior média.

# Veja em anexo um exemplo do arquivo “notas_alunos.csv”.

import pandas as pd

aluno = ["Aluno_1", "Aluno_2", "Aluno_3", "Aluno_4"]
nota_1 = [7, 3, 9, 10]
nota_2 = [7, 10, 4, 6]
faltas = [1,7,2,9]

info = {"aluno": aluno, "nota_1": nota_1, "nota_2": nota_2, "faltas": faltas}

df = pd.dataframe(info)

df.to_csv('demo.csv')