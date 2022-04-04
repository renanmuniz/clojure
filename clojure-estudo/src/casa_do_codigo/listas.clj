(ns casa-do-codigo.listas)


(defn imprimeLista []
  (def lista '(1 2 3 4 5))
  (println lista))

(defn contaItensLista []
  (def lista '(1 2 3 4 5 6))
  (count lista))

(defn criaLista [valorMaxExclusivo]
  (def lista (range 1 valorMaxExclusivo))
  (println lista)
  )

(def cantora-arretada (list "Renata Arruda" "João Pessoa"
                            23 "dezembro" 1967))
(println (nth cantora-arretada 0))
(println (nth cantora-arretada 1))
(println (first cantora-arretada))
(println (last cantora-arretada))
(conj cantora-arretada "MPB")
(println cantora-arretada)                                  ; imutabilidade, nao aparece MPB

