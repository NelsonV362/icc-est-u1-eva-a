package Views;

public class ViewConsole {

    
    public ViewConsole(String string, int i) {
    }

    public void sortByAgeWithInsertion(ViewConsole[] libros){
           for(int i = 1; i < libros.length; i++){
                     int j = i - 1;
                  while(j>=0 && libros[j].getLibro() > libros[i].getLibro()){
                        libros[j+1] = libros[j];
                        j--;
                    }
                    libros[j+1] = libros[i];
               }
             }

    private int getLibro() {
        throw new UnsupportedOperationException("Libro no encontrado/Libro no disponible'");
    }
}
