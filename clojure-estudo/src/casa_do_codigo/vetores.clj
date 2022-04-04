(ns casa-do-codigo.vetores)


(def vetor '(1 2 3 4 5 6))
(println vetor)

(def vetor2 [6 5 4 3 2 1])
(println vetor2)

(def vetorNomes (vector "Renan" "Joao" "Maria" "Jose" 1990))
(println (get vetorNomes 3))
(println (get vetorNomes 0))
(println (last vetorNomes))
(conj vetorNomes "antonio")
(println (last vetorNomes))                                 ;imutabilidade, nao aparece o antonio



