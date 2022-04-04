(ns casa-do-codigo.maps)

(def meumap (hash-map :valor 200 :tipo "receita"))
(println meumap)
; =>{:valor 200, :tipo receita}

(def transacao {:valor 200 :tipo "receita"})
(println transacao)

(assoc transacao :categoria "Educação")
(println transacao)
; {:valor 200, :tipo receita}

(def novomap (assoc transacao :categoria "Educação"))
(println novomap)
; {:valor 200, :tipo receita, :categoria Educação}

(get transacao :valor)
; => 200


; retornar vazio inves de nulo caso procure por um map nao encontrado:
; procurar sempre retornar vazio ao inves de nulo "nil". Evita futuros problemas.
(get transacao :id '())
(get transacao :tipo '())


