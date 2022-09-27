(ns casa-do-codigo.atom)

(def registros (atom ()))
;; => #'clojure-estudo.core/registros

registros
;;=> #object[clojure.lang.Atom 0x28c480a1 {:status :ready, :val ()}]

@registros
;;=> ()

(swap! registros conj {:valor 29M :tipo "despesa"
                       :comentario "Livro de Clojure" :moeda "R$"
                       :data "03/12/2016"})
;; ({:valor 29M, :tipo "despesa", :comentario "Livro de Clojure", :moeda "R$", :data "03/12/2016"})

@registros
;; => ({:valor 29M, :tipo "despesa", :comentario "Livro de Clojure", :moeda "R$", :data "03/12/2016"})

(swap! registros conj
       {:valor 2700M :tipo "receita" :comentario "Bico"
        :moeda "R$" :data "01/12/2016"})
;({:valor 2700M, :tipo "receita", :comentario "Bico", :moeda "R$", :data "01/12/2016"}
; {:valor 29M, :tipo "despesa", :comentario "Livro de Clojure", :moeda "R$", :data "03/12/2016"})