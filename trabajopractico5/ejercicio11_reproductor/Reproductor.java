public class Reproductor {
    // Dependencia de uso: solo usa Cancion como parámetro
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo la canción: " + cancion.getTitulo() +
                           " del artista: " + cancion.getArtista().getNombre());
    }
}
