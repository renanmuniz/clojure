(ns disciplinas.core
  (:require [clojure.string :refer [upper-case join]]))


(defn disciplinas
  []
  [{:nome "Estrutura de dados" :semestre 2}
   {:nome "Algoritmos" :semestre 1}
   {:nome "Inteligencia Artificial" :semestre 3}])

(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (join ", "(map upper-case (map :nome (filter #(>= (:semestre %) semestre-atual) disciplinas)))))

(nomes-disciplinas-restantes (disciplinas) 2)
;=> "ESTRUTURA DE DADOS, INTELIGENCIA ARTIFICIAL"



;Threading last ->>:
;Passa o resultado da funcao anterior como segundo parametro da proxima, implicitamente.
(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (->> disciplinas
       (filter #(>= (:semestre %) semestre-atual))
       (map :nome)
       (map upper-case)
       (join ", ")
  )
)

(nomes-disciplinas-restantes (disciplinas) 2)
;=> "ESTRUTURA DE DADOS, INTELIGENCIA ARTIFICIAL"


;Threading last ->:
;Igual ao threading last porem passa o resultado da funcao anterior como primeiro parametro da proxima, implicitamente.








