package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMaco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        
        //Creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //creamos la mascota
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMaco);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atenEsp);
        mascota.setObservaciones(observaciones);
        
        mascota.setDuenio(duenio);
        
        controlPersis.guardar(duenio,mascota);
        
        

    }

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota (num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMaco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        masco.setNombre(nombreMaco);
        masco.setColor(color);
        masco.setRaza(raza);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        
        //modifico mascota
        controlPersis.modificarMascota(masco);
        
        //modifico duenio
        Duenio duenio = this.buscarDuenio(masco.getDuenio().getId_duenio());
        duenio.setCelDuenio(celDuenio);
        duenio.setNombre(nombreDuenio);
        
        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }

    
}
