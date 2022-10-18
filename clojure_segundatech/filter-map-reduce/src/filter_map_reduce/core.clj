(ns filter-map-reduce.core)

; Crie uma funcao que recebe um vetor de numeros referente ao ano do aluno e retorne
; a quantidade de alunos no quinto ano

; [5 5 6 7 8 6 5 5] -> [5 5 5 5] -> 4
(defn is-quinto-ano?
  [ano]
  (= ano 5))

(defn quantidade-estudantes-quinto-ano
  [estudantes]
  (count (filter is-quinto-ano? estudantes))
  )
(quantidade-estudantes-quinto-ano [5 5 6 7 8 6 5 5])
;=> 4

; Usnado funcao anonima:
(defn quantidade-estudantes-quinto-ano
  [estudantes]
  (count (filter (fn [ano] (= ano 5)) estudantes))
  )
(quantidade-estudantes-quinto-ano [5 5 6 7 8 6 5 5])
;=> 4

;Outro modo funcao anonima:
(defn quantidade-estudantes-quinto-ano
  [estudantes]
  (count (filter #(= 5 %) estudantes))
  )
(quantidade-estudantes-quinto-ano [5 5 6 7 8 6 5 5])
;=> 4


;DESAFIO:
;Crie uma funcao que recebe um vetor de idades e retorna a soma.

;reduce recebe como primeiro parametro uma funcao e depois uma estrutura de dados
;como funciona o reduce:
;usando como exemplo os valores 1 2 3 4 5 6
;(+ (+ (+ (+ (+ 1 2) 3) 4) 5) 6)
;=> 21

(defn soma-idades
  [idades]
  (reduce + idades))
(soma-idades [1 2 3 4 5 6])
;=> 21



;DESAFIO:
;Crie uma funcao que recebe strings de nomes e retorne o tamanho medio dos nomes

(defn tamanho-medio-nomes
  [nomes]
  (/ (reduce + (map count nomes)) (count nomes))
  )
(tamanho-medio-nomes ["renan" "renan" "renan"])
;=> 5
(tamanho-medio-nomes ["renan" "vinicius" "evelyn" "ana"])
;=> 11/2

;mesma coisa do acima mas ignorando nomes com 3 ou menos caracteres
(defn tamanho-medio-nomes-3-caracteres
  [nomes]
  (filter #(> 3 %) (count nomes))
  (/ (reduce + (map count (filter (fn [nome] (> (count nome) 3)) nomes))) (count (filter (fn [nome] (> (count nome) 3)) nomes)))
  )

;usando funcao anonima de forma compacta:
(defn tamanho-medio-nomes-3-caracteres
  [nomes]
  (filter #(> 3 %) (count nomes))
  (/ (reduce + (map count (filter #(> (count %) 3) nomes))) (count (filter #(> (count %) 3) nomes)))
  )

(tamanho-medio-nomes-3-caracteres ["renan" "vinicius" "evelyn" "ana"])
;=> 19/3
