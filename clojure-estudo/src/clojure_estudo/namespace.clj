(ns clojure-estudo.namespace)

(defn retornaNameSpace []
  (println ">>>>" *ns*))
(retornaNameSpace)


(defn example []
  (alias 'hello 'clojure-estudo.hello)
  (clojure-estudo.hello "oi"))
(example)

(alias 'user 'clojure.string)
(ns-aliases 'user)
(println (user/upper-case "renan muniz merlo"))


(require '[clojure-estudo.hello :as hello])
(println (hello/imprime "renan muniz merlo"))


(defn retornaTodosNamespaces []
  (println (all-ns)))
(retornaTodosNamespaces)


(defn procuraNamespace []
  (println (find-ns 'clojure.string)))
(procuraNamespace)


(defn retornaNomeDoNamespace []
  (println (ns-name 'clojure.core)))
(retornaNomeDoNamespace)


(defn retornaAliasAtribuidoAoNamespace []
  (println (ns-aliases 'clojure.core)))
(retornaAliasAtribuidoAoNamespace)


(defn retornaAQtdReferenciasAUmNamespace []
  (println (count (ns-map 'clojure.core))))
(retornaAQtdReferenciasAUmNamespace)



