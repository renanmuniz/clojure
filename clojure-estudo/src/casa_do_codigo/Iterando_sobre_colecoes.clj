(ns casa-do-codigo.Iterando-sobre-colecoes)

(defn resumo [transacao]
  (select-keys transacao [:valor :tipo :data]))

(def transacoes
  [
   {:valor 33.0 :tipo "debito" :data "04/04/2022" :descricao "farmacia"}
   {:valor 340.0 :tipo "credito" :data "01/04/2022" :descricao "combustivel"}
   {:valor 100.5 :tipo "debito" :data "30/03/2022" :descricao "restaurante"}
 ]
)

(map resumo transacoes)                                     ;retorna transacoes com dados selecionados na funcao resumo


(defn credito? [transacao]
  ( = (:tipo transacao) "credito"))

(filter credito? transacoes)                                ;retorna dados que satisfazem a funcao credito