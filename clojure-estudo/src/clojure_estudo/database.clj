(ns clojure-estudo.database
  (:require [clojure.java.jdbc :as sql]
            [clojure.string :as str]))

(def mysql-db {
               :subprotocol "mysql"
               :subname "//127.0.0.1:3306/clojuredb"
               :user "root"
               :password "3885"})


; Consultar:
  (println (sql/query mysql-db
                      ["select * from cadastro"]
                      ))


(println (sql/query mysql-db
                    ["select nome from cadastro order by created_at desc"]
                    ))

(defn buscaDados []
  (def seq1 (seq [(sql/query mysql-db
                             ["select nome from cadastro order by created_at desc"]
                             )]))
  (println seq1)
  )
(buscaDados)


; Inserir:
(defn inserirDb [nome]
  (sql/insert! mysql-db :cadastro {:nome nome}))
(inserirDb "Vinicius")


(defn inserirDb2 [nomes]
  (doseq [n nomes]
    (println "Inserindo: " n)
    (sql/insert! mysql-db :cadastro {:nome n})
    )
  )
(inserirDb2 ["Vinicius" "Joao" "jose" "maria"])


; Deletar:
(defn deletarDb [nome]
  (sql/delete! mysql-db :cadastro ["nome = ?" nome]))
(deletarDb "Vinicius")


; Update:
(defn updateDb [nome nomeNovo]
  (sql/update! mysql-db :cadastro
               {:nome nomeNovo}
               ["nome = ?" nome]))
(updateDb "Joao" "Joao Updated")

(defn updateDb [nome nomeNovo]
  (sql/update! mysql-db :cadastro
               {:nome nomeNovo}
               ["nome = ?" nome]))
(updateDb "Joao Updated" "Joao")


; transaction:
(defn updateDbTransaction [nome nomeNovo]
  (sql/with-db-transaction [t-con mysql-db]
                         (sql/update! t-con
                                      :cadastro
                                      {:nome nomeNovo}
                                      ["nome = ?" nome]
                         )
   )
)
(updateDbTransaction "Joao" "Joao Updated via Transaction")