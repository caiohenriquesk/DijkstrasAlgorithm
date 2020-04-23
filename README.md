# DijkstrasAlgorithm
Implementacao do algoritmo de Dijkstra na linguagem Java. Serve para encontrar o menor caminho entre um ponto 'A' e um ponto 'B' dentro de um grafo.

Exemplo:

- Levando em consideracoes que gostaria de saber a menor distancia percorrida entre o Node 'A' e o Node 'F' do grafo abaixo.

Grafo:
          F
         /|
        / |
B-----D\  |
|\   /| \ |
| \ / |  \| 
|  C  |  /G
| / \ | /
|/   \|/
A-----E

Distancias:
Node A)
  A -> B = 4
  A -> C = 3
  A -> E = 7
Node B)
  B -> A = 4
  B -> C = 6
  B -> D = 5
Node C)
  C -> A = 3
  C -> B = 6
  C -> D = 11
  C -> E = 8
Node D)
  D -> B = 5
  D -> C = 11
  D -> E = 2
  D -> F = 2
  D -> G = 10
Node E)
  E -> A = 7
  E -> C = 8
  E -> D = 2
  E -> G = 5
Node F)
  F -> D = 2
  F -> G = 3
Node G)
  G -> D = 10
  G -> E = 5
  G -> F = 3

A resultado da menor distancia seria 11 e o caminho percorrido seria A->B->D->F.

