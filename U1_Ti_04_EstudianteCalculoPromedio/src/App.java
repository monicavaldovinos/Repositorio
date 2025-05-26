public class App {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];

        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante est = new Estudiante();
            est.setNombre("Estudiante " + (i + 1));
            est.setMatricula("20253DS" + (i + 1));

            for (int j = 0; j < 5; j++) {
                est.setNota(j, 60 + Math.random() * 40);
            }

            estudiantes[i] = est;
        }

        for (Estudiante est : estudiantes) {
            double promedio = est.calcularPromedio();
            System.out.printf("Nombre: %s\nMatricula: %s\nPromedio: %.2f\nAprobado: %s\n\n",
                est.getNombre(), est.getMatricula(), promedio, est.aprobado() ? "Sí" : "No");
        }
    }
}

