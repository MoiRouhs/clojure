;; Hash son estructuras parecidas a los de ruby y se componen de una llave y su valor.

(def df {:a "amor", :b "bobo", :c "coco"}) ;; los hash puede tener claves ":clave" como en ruby
(def palabras {"amor" 1, "dios" 5, "amigo" 20}) ;; La llave y el valor se separa por n espacio, y las parajeas por una coma 

(println (map? palabras)) ;; Se le pregunta si es un hash devuelve "true / false"
(println (keys palabras)) ;; Mostrar las llaves del Hash
(println (vals palabras)) ;; Mostrar los valores del Hash
(println (get df :a)) ;; Se obtiene el valor de una llave.
(println (palabras "amigo")) ;; Otra forma de obtenerlo sin usar "get"
