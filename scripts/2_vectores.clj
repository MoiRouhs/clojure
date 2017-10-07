;; Vectores o arreglos

(def a ["hola" true "luz" 2 "carlos" 23.2 "rocha"]) ;; De tipo variado.
(println (count a)) ;; Largo del vector
(println (nth a 2)) ;; buscar elemento por su indice
(println (first a)) ;; Primer elemento del vector
(println (rest a)) ;; Muestra todo el vector ecepto el primero
(println (.indexOf a true)) ;; Muestra el indice del elemento 

