(ns casa-do-codigo.imutabilidade)

(def membros-fundadores
  (list "Argentina" "Brasil" "Paraguai" "Uruguai"))
;;=> ("Argentina" "Brasil" "Paraguai" "Uruguai")

(def membros-plenos (cons "Venezuela" membros-fundadores))
;;=> ("Venezuela" "Argentina" "Brasil" "Paraguai" "Uruguai")

(rest membros-plenos)
;;=> ("Argentina" "Brasil" "Paraguai" "Uruguai")

(identical? (rest membros-plenos)
            membros-fundadores)
;;=> true
;; Ou seja, membros pleno SEM a venezuela, é o membros-fundadores. Mesmo objeto. Mesmo espaco de memoria.

