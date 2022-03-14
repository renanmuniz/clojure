(ns clojure-estudo.structmaps)

;StructMaps are used for creating structures in Clojure. For example, if you wanted to create a structure
; which comprised of an Employee Name and Employeeid, you can do that with StructMaps.

(defn struct1 []
  (println (defstruct Employee :EmployeeName :Employeeid)))
(struct1)

(defn struct2 []
  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct Employee "John" 1))
  (println emp))
(struct2)

(defn struct3 []
  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct-map Employee :EmployeeName "John" :Employeeid 1))
  (println emp))
(struct3)

(defn struct4 []
  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct-map Employee :EmployeeName "John" :Employeeid 1))
  (println (:Employeeid emp))
  (println (:EmployeeName emp)))
(struct4)

(defn imutabilidade []
  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct-map Employee :EmployeeName "John" :Employeeid 1))
  (println (:EmployeeName emp))

  (assoc emp :EmployeeName "Mark")
  (println (:EmployeeName emp)))
(imutabilidade)

; Unica forma de atribuir novo valor é criando um novo campo
(defn imutabilidade2 []
  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct-map Employee :EmployeeName "John" :Employeeid 1))
  (def newemp (assoc emp :EmployeeName "Mark"))
  (println newemp))
(imutabilidade2)

(defn imutabilidade3 []
  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct-map Employee :EmployeeName "John" :Employeeid 1))
  (def newemp (assoc emp :EmployeeRank "A"))
  (println newemp))
(imutabilidade3)