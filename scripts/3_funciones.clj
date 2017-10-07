;; En clojure mantiene la misma estructura para la creacion de variables o funciones.

(defn hola [] ;; defn es la palabra clave para declarar la función, la sigue el nombre y un vector que revibe los argumentos de la funcion. 
 (println "MI primer función") ;; Bloque de código a ejecutar.
)
(hola) ;; La funcion se invoca dentro de parentesis.

(defn argumentos [arg] ;; El vector recibe los argumentos, los que se deseen.
	 (println arg)
)
(argumentos "Desde el argumento") ;; Al invocar la funcion a su derecha se le puede lincuir los argumentos.

(defn retorno [arg]
	arg ;; El retorno es automatico  al estilo de rust.
)

(def retornado (retorno "Desde retornado")) ;; Asignando el retorno de la función a una variable.
(println retornado)

