(ns compras.core)


;Mapas
(:nome "Renan" :idade 32 :email "renan@email.com")




;Carrinhos de compras:
(defn compras []
  {:tomate {:quantidade 2 :preco 5}
   :arroz {:quantidade 1 :preco 4}
   :feijao {:quantidade 2 :preco 10}}
  )

(compras)
;=> {:tomate {:quantidade 2, :preco 5}, :arroz {:quantidade 1, :preco 4}, :feijao {:quantidade 2, :preco 10}}


;recuperando valores de um mapa:
;1
(get (compras) :tomate)
;=> {:quantidade 2, :preco 5}
;se vier resultado nulo retorna nulo.

;2!
((compras) :tomate)
;=> {:quantidade 2, :preco 5}
;Se vier resultado nulo dá nullpointerexception! Nao é recomendado utilizar.

;3
(:tomate (compras))
;=> {:quantidade 2, :preco 5}
;se vier resultado nulo retorna nulo.
;Mais utilizado.


(:preco (:tomate (compras)))
;=> 5

;Valor padrao:
(:batata (compras))
;=> nil

(:batata (compras) {:quantidade 0 :preco 0})
;=> {:quantidade 0, :preco 0}

(conj (compras) {:alface {:quantidade 2 :preco 8}})
;=>
;{:tomate {:quantidade 2, :preco 5},
; :arroz {:quantidade 1, :preco 4},
; :feijao {:quantidade 2, :preco 10},
; :alface {:quantidade 2, :preco 8}}


(assoc (compras) :limao {:quantidade 2 :preco 8})
;=>
;{:tomate {:quantidade 2, :preco 5},
; :arroz {:quantidade 1, :preco 4},
; :feijao {:quantidade 2, :preco 10},
; :limao {:quantidade 2, :preco 8}}


(assoc (compras) :tomate {:quantidade 3 :preco 4})
;=> {:tomate {:quantidade 3, :preco 4},    ATUALIZOU O VALOR DE TOMATE, SUBSTITUIU.
; :arroz {:quantidade 1, :preco 4},
; :feijao {:quantidade 2, :preco 10}}


(dissoc (compras) :feijao)
;=> {:tomate {:quantidade 2, :preco 5},
; :arroz {:quantidade 1, :preco 4}}


(dissoc (compras) :tomate :arroz)
;=> {:feijao {:quantidade 2, :preco 10}}


{:nome "Renan Muniz" :idade 32}

(inc 1)
;=> 2

(update {:nome "Renan Muniz" :idade 32} :idade inc)
;=> {:nome "Renan Muniz", :idade 33}

;Pode usar funcoes anonimas:
(update {:nome "Renan Muniz" :idade 32} :idade #(+ 10 %))
;=> {:nome "Renan Muniz", :idade 42}

;Idade em dias:
(update {:nome "Renan Muniz" :idade 32} :idade #(* 365 %))
;=> {:nome "Renan Muniz", :idade 11680}


(update-in (compras) [:tomate :preco] #(+ 10 %))
;=> {:tomate {:quantidade 2, :preco 15},
; :arroz {:quantidade 1, :preco 4},
; :feijao {:quantidade 2, :preco 10}}


(update-in (compras) [:tomate :preco] + 10)
;=> {:tomate {:quantidade 2, :preco 15},
; :arroz {:quantidade 1, :preco 4},
; :feijao {:quantidade 2, :preco 10}}


