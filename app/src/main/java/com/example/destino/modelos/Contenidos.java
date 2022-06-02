package com.example.destino.modelos;

import com.example.destino.R;

public class Contenidos {

    private Pagina[] mPaginas;

    public Contenidos(){
        mPaginas = new Pagina[8];

        mPaginas[0] = new Pagina (
                R.drawable.img0,
                "Saludos joven %1$s, aquí empieza tu viaje, si lo haces bien, consguiras tus ",
                new Opcion ( "Entrenar y formarme", 1 ),
                new Opcion ( "Ir a luchar ¡Ya!", 2 ));

        mPaginas[1] = new Pagina (
                R.drawable.img1,
                "Hazte experto en el manejo de una de estas armas",
                new Opcion ( "Elijo el Palo", 1 ),
                new Opcion ( "Elijo la espada", 2 ));
        mPaginas[2] = new Pagina (
                R.drawable.img2,
                "Este es el legendario Suzuky Millamoto, maestro del manejo de estrellas ninja",
                new Opcion ( "No, volver a entrenar", 1 ),
                new Opcion ( "Si, luchar ¡Ya!", 2 ));
        mPaginas[3] = new Pagina (
                R.drawable.img3,
                "¡Un texto de ejemplo, diseña tu propia historia!",
                new Opcion ( "Estoy listo, quiero luchar", 1 ),
                new Opcion ( "Quiero aprender a manejar la espada", 2 ));
        mPaginas[4] = new Pagina (
                R.drawable.img4,
                "Bien \"%1$s, has elejido aprender a usar la espada, ahora Suzuki está despistado ",
                new Opcion ( "Quiero luchar con honor", 1 ),
                new Opcion ( "Atacar por la espalda", 2 ));
        mPaginas[5] = new Pagina (
                R.drawable.img5,
                "Este es Suzuki, maestro, usar palo o espada? ",
                new Opcion ( "Palo", 1 ),
                new Opcion ( "Espada", 2 ));
        mPaginas[6] = new Pagina (
                R.drawable.img6,
                "Has elejio tu destino y has elejido mal... para enfrentarte a un ninja de verdad");

        mPaginas[7] = new Pagina (
                R.drawable.img7,
                "Has elejido tu destino y has trabajado duro, aquí tienes tus estrellas");
    }

        public Pagina getPage(int pageNumber){
                return mPaginas[pageNumber];
        }

    }
}
