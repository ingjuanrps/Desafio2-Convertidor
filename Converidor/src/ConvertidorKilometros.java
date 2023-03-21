import javax.swing.JOptionPane;

public class ConvertidorKilometros {

    public void ConvertirMetroAVarios(double valor) {
        double metroKilo = (valor / 1000);
        double metroHecto = (valor / 100);
        double metroDeca = (valor / 10);
        double metroDeci = (valor * 10);
        double metroCenti  = (valor * 100);
        double metroMili = (valor * 1000);
        double metroPulga = valor * 39.37;
        double metroYarda = valor * 1.094;
        double metroPies = valor * 3.281;
        double metroMilla = valor / 1609;
        metroKilo = (double) Math.round(metroKilo);
        metroHecto = (double) Math.round(metroHecto);
        metroDeca = (double) Math.round(metroDeca);
        metroDeci = (double) Math.round(metroDeci);
        metroCenti = (double) Math.round(metroCenti);
        metroMili = (double) Math.round(metroMili);
        metroPulga = (double) Math.round(metroPulga);
        metroYarda = (double) Math.round(metroYarda);
        metroPies = (double) Math.round(metroPies);
        metroMilla = (double) Math.round(metroMilla);
        JOptionPane.showMessageDialog(null,
        "Tus "+valor+" m, equivalen a : "+ 
        "\n "+ metroKilo + " Kilometros  (km)."+
        "\n "+metroHecto+ " Hectometros (hm)."+
        "\n "+metroDeca+ " Decametros  (dam)."+
        "\n "+metroDeci+ " Decimetros  (dm)."+
        "\n "+metroCenti+" Centimetros (cm)."+
        "\n "+metroMili+ " Milimetros  (mm)."+
        "\n "+metroPulga+ " Pulgadas    (in)."+
        "\n "+metroYarda+ " Yardas      (yd)."+
        "\n "+metroPies+ " Pies        (ft)."+
        "\n "+metroMilla+ " Millas      (mi).",
        valor + " Metros a: ", 1);
    }

    public void ConvertirKilometroAVarios(double valor) {
        double Kilometro = (valor * 1000);
        double KiloHecto = (valor * 10);
        double KiloDeca = (valor * 100);
        double KiloDeci = (valor * 10000);
        double KiloCenti  = (valor * 100000);
        double KiloMili = (valor * 1000000);
        double KiloPulga = valor * 39370.1;
        double KiloYarda = valor * 1094;
        double KiloPies = valor * 3281;
        double KiloMilla = valor / 1.609;
        Kilometro= (double) Math.round(Kilometro);
        KiloHecto= (double) Math.round(KiloHecto);
        KiloDeca= (double) Math.round(KiloDeca);
        KiloDeci= (double) Math.round(KiloDeci);
        KiloCenti= (double) Math.round(KiloCenti);
        KiloMili= (double) Math.round(KiloMili);
        KiloPulga= (double) Math.round(KiloPulga);
        KiloYarda= (double) Math.round(KiloYarda);
        KiloPies= (double) Math.round(KiloPies);
        KiloMilla= (double) Math.round(KiloMilla);
        JOptionPane.showMessageDialog(null,
        "Tus "+valor+" km, equivalen a : " +
        "\n " +Kilometro + " Metros (m)."+
        "\n "+KiloHecto+ " Hectometros (hm)."+
        "\n "+KiloDeca+ " Decametros (dam)."+
        "\n "+KiloDeci+ " Decimetros (dm)."+
        "\n "+KiloCenti+" Centimetros (cm)."+
        "\n "+KiloMili+ "Milimetros (mm)."+
        "\n "+KiloPulga+ " Pulgadas (in)."+
        "\n "+KiloPies+ " Pies (ft)."+
        "\n "+KiloMilla+ " Millas (mi).",
        valor + " Kilometros a: ", 1);
    }

    public void ConvertirHetoAVarios(double valor) {
        double HetoKilo = (valor / 10);
        double HetoDeca = (valor * 10);
        double HetoMetro = (valor * 100);
        double HetoDeci = (valor * 1000);
        double HetoCenti  = (valor * 10000);
        double HetoMili = (valor * 100000);
        double HetoPulga = valor * 3937.01;
        double HetoYarda = valor * 109.4;
        double HetoPies = valor * 328.1;
        double HetoMilla = valor / 16.093;
        HetoKilo= (double) Math.round(HetoKilo);
        HetoDeca= (double) Math.round(HetoDeca);
        HetoMetro= (double) Math.round(HetoMetro);
        HetoDeci= (double) Math.round(HetoDeci);
        HetoCenti= (double) Math.round(HetoCenti);
        HetoMili= (double) Math.round(HetoMili);
        HetoPulga= (double) Math.round(HetoPulga);
        HetoYarda= (double) Math.round(HetoYarda);
        HetoPies= (double) Math.round(HetoPies);
        HetoMilla= (double) Math.round(HetoMilla);
        JOptionPane.showMessageDialog(null,
        "Tus "+valor+" hm, equivalen a : " +
        "\n "+HetoKilo + " Kilometros (km)."+
        "\n "+HetoDeca+ " Decametros (dam)."+
        "\n "+HetoMetro+ " Metros (m)."+
        "\n "+HetoDeci+ " Decimetros (dm)."+
        "\n "+HetoCenti+" Centimetros (cm)."+
        "\n "+HetoMili+ " Milimetros (mm)."+
        "\n "+HetoPulga+ " Pulgadas (in)."+
        "\n "+HetoYarda+ " Yardas (yd)."+
        "\n "+HetoPies+ " Pies (ft)."+
        "\n "+HetoMilla+ " Millas (mi).",
        valor + " Hectometro a: ", 1);
    }

    public void ConvertirDecaAVarios(double valor) {
        double DecaKilo = (valor / 100);
        double DecaHecto = (valor / 10);
        double DecaMetro = (valor * 10);
        double DecaDeci = (valor * 100);
        double DecaCenti  = (valor * 1000);
        double DecaMili = (valor * 10000);
        double DecaPulga = valor * 393.70;
        double DecaYarda = valor * 10.936;
        double DecaPies = valor * 32.808;
        double DecaMilla = valor / 160.9;
        DecaKilo= (double) Math.round(DecaKilo);
        DecaHecto= (double) Math.round(DecaHecto);
        DecaMetro= (double) Math.round(DecaMetro);
        DecaDeci= (double) Math.round(DecaDeci);
        DecaCenti= (double) Math.round(DecaCenti);
        DecaMili= (double) Math.round(DecaMili);
        DecaPulga= (double) Math.round(DecaPulga);
        DecaYarda= (double) Math.round(DecaYarda);
        DecaPies= (double) Math.round(DecaPies);
        DecaMilla= (double) Math.round(DecaMilla);
        JOptionPane.showMessageDialog(null,
        "Tus "+valor+" dam, equivalen a : " +
        "\n "+DecaKilo + " Kilometros (km)."+
        "\n "+DecaHecto+ " Hectometros (hm)."+
        "\n "+DecaMetro+ " Metros (m)."+
        "\n "+DecaDeci+ " Decimetros (dm)."+
        "\n "+DecaCenti+" Centimetros (cm)."+
        "\n "+DecaMili+ " Milimetros (mm)."+
        "\n "+DecaPulga+ " Pulgadas (in)."+
        "\n "+DecaYarda+ " Yardas (yd)."+
        "\n "+DecaPies+ " Pies (ft)."+
        "\n "+DecaMilla+ " Millas (mi).",
        valor + " Decametro a: ", 1);
    }

    public void ConvertirDecimetroAVArios(double valor) {
        double DeciKilo = (valor / 10000);
        double DeciHecto = (valor / 1000);
        double DeciDeca = (valor / 100);
        double DeciMetro = (valor / 10);
        double DeciCenti  = (valor * 10);
        double DeciMili = (valor * 100);
        double DeciPulga = valor * 3.9370;
        double DeciYarda = valor / 9.144;
        double DeciPies = valor / 3.048;
        double DeciMilla = valor / 16090;
        DeciKilo= (double) Math.round(DeciKilo);
        DeciHecto= (double) Math.round(DeciHecto);
        DeciDeca= (double) Math.round(DeciDeca);
        DeciMetro= (double) Math.round(DeciMetro);
        DeciCenti= (double) Math.round(DeciCenti);
        DeciMili= (double) Math.round(DeciMili);
        DeciPulga= (double) Math.round(DeciPulga);
        DeciYarda= (double) Math.round(DeciYarda);
        DeciPies= (double) Math.round(DeciPies);
        DeciMilla= (double) Math.round(DeciMilla);
        JOptionPane.showMessageDialog(null,
        "Tus "+valor+" dm, equivalen a : " +
        "\n " +DeciKilo + " Kilometros (km)."+
        "\n "+DeciHecto+ " Hectometros (hm)."+
        "\n "+DeciDeca+ " Decametros (dam)."+
        "\n "+DeciMetro+ " Metros (m)."+
        "\n "+DeciCenti+" Centimetros (cm)."+
        "\n "+DeciMili+ " Milimetros (mm)."+
        "\n "+DeciPulga+ " Pulgadas (in)."+
        "\n "+DeciYarda+ " Yardas (yd)."+
        "\n "+DeciPies+ " Pies (ft)."+
        "\n "+DeciMilla+ " Millas (mi).",
        valor + " Decimetro a: ", 1);
    }

    public void ConvertirCentiAVarios(double valor) {
        double CentiKilo = (valor / 100000);
        double CentiHecto = (valor / 10000);
        double CentiDeca = (valor / 1000);
        double CentiMetro = (valor / 100);
        double CentiDeci  = (valor / 10);
        double CentiMili = (valor * 10);
        double CentiPulga = valor / 2.54;
        double CentiYarda = valor / 91.54;
        double CentiPies = valor / 30.48;
        double CentiMilla = valor / 160900;
        CentiKilo= (double) Math.round(CentiKilo);
        CentiHecto= (double) Math.round(CentiHecto);
        CentiDeca= (double) Math.round(CentiDeca);
        CentiMetro= (double) Math.round(CentiMetro);
        CentiDeci= (double) Math.round(CentiDeci);
        CentiMili= (double) Math.round(CentiMili);
        CentiPulga= (double) Math.round(CentiPulga);
        CentiYarda= (double) Math.round(CentiYarda);
        CentiPies= (double) Math.round(CentiPies);
        CentiMilla= (double) Math.round(CentiMilla);
        JOptionPane.showMessageDialog(null,
        "Tus "+valor+" cm, equivalen a : " +
        "\n " +CentiKilo + " Kilometros (km)."+
        "\n "+CentiHecto+ " Hectometros (hm)."+
        "\n "+CentiDeca+ " Decametros (dam)."+
        "\n "+CentiMetro+ " Metros (m)."+
        "\n "+CentiDeci+" Decimetros (dm)."+
        "\n "+CentiMili+ "Milimetros (mm)."+
        "\n "+CentiPulga+ " Pulgadas (in)."+
        "\n "+CentiYarda+ " Yardas (yd)."+
        "\n "+CentiPies+ " Pies (ft)."+
        "\n "+CentiMilla+ " Millas (mi).",
        valor + " Centimetro a: ", 1);
    }

    public void ConvertirMiliAvarios(double valor) {
        double MiliKilo = (valor / 100000);
        double MiliHecto = (valor / 10000);
        double MiliDeca = (valor / 1000);
        double MiliMetro = (valor / 100);
        double MiliDeci  = (valor / 10);
        double MiliCenti = (valor * 10);
        double MiliPulga = valor / 2.54;
        double MiliYarda = valor / 91.54;
        double MiliPies = valor / 30.48;
        double MiliMilla = valor / 160900;
        MiliKilo= (double) Math.round(MiliKilo);
        MiliHecto= (double) Math.round(MiliHecto);
        MiliDeca= (double) Math.round(MiliDeca);
        MiliMetro= (double) Math.round(MiliMetro);
        MiliDeci= (double) Math.round(MiliDeci);
        MiliCenti= (double) Math.round(MiliCenti);
        MiliPulga= (double) Math.round(MiliPulga);
        MiliYarda= (double) Math.round(MiliYarda);
        MiliPies= (double) Math.round(MiliPies);
        MiliMilla= (double) Math.round(MiliMilla);
        JOptionPane.showMessageDialog(null,
        "Tus "+valor+" mm, equivalen a : " +
        "\n "+MiliKilo + " Kilometros (km)."+
        "\n "+MiliHecto+ " Hectometros (hm)."+
        "\n "+MiliDeca+ " Decametros (dam)."+
        "\n "+MiliMetro+ " Metros (m)."+
        "\n "+MiliDeci+" Decimetros (dm)."+
        "\n "+MiliCenti+ " Centimetros (cm)."+
        "\n "+MiliPulga+ " Pulgadas (in)."+
        "\n "+MiliYarda+ " Yardas (yd)."+
        "\n "+MiliPies+ " Pies (ft)."+
        "\n "+MiliMilla+ " Millas (mi).",
        valor + " Milimetro a: ", 1);
    }

    public void ConvertirPulgAVarios(double valor) {
        double PulgaKilo = (valor / 39370);
        double PulgaHecto = (valor / 3937);
        double PulgaDeca = (valor / 393.7);
        double PulgaMetro = (valor / 39.37);
        double PulgaDeci  = (valor / 3.937);
        double PulgaCenti = (valor * 2.54);
        double PulgaMili = valor * 25.4;
        double PulgaYarda = valor / 36;
        double PulgaPies = valor / 63360;
        double PulgaMilla = valor / 160900;
        PulgaKilo= (double) Math.round(PulgaKilo);
        PulgaHecto= (double) Math.round(PulgaHecto);
        PulgaDeca= (double) Math.round(PulgaDeca);
        PulgaMetro= (double) Math.round(PulgaMetro);
        PulgaDeci= (double) Math.round(PulgaDeci);
        PulgaCenti= (double) Math.round(PulgaCenti);
        PulgaMili= (double) Math.round(PulgaMili);
        PulgaYarda= (double) Math.round(PulgaYarda);
        PulgaPies= (double) Math.round(PulgaPies);
        PulgaMilla= (double) Math.round(PulgaMilla);
        JOptionPane.showMessageDialog(null,
        "Tus "+valor+" in, equivalen a : " +
        "\n "+PulgaKilo + " Kilometros (km)."+
        "\n "+PulgaHecto+ " Hectometros (hm)."+
        "\n "+PulgaDeca+ " Decametros (dam)."+
        "\n "+PulgaMetro+ " Metros (m)."+
        "\n "+PulgaDeci+" Decimetros (dm)."+
        "\n "+PulgaCenti+ " Centimetros (cm)."+
        "\n "+PulgaMili+ " Milimetros (mm)."+
        "\n "+PulgaYarda+ " Yardas (yd)."+
        "\n "+PulgaPies+ " Pies (ft)."+
        "\n "+PulgaMilla+ " Millas (mi).",
        valor + " Pulgadas a: ", 1);
    }

    public void ConvertirYardasAVarios(double valor) {
        double YardaKilo = (valor / 1094);
        double YardaHecto = (valor / 109.4);
        double YardaDeca = (valor / 10.936);
        double YardaMetro = (valor / 1.094);
        double YardaDeci  = (valor * 9.144);
        double YardaCenti = (valor * 91.44);
        double YardaMili = valor * 9.144;
        double YardaPulgada = valor * 36;
        double YardaPies = valor / 3;
        double YardaMilla = valor / 1760;
        YardaKilo= (double) Math.round(YardaKilo);
        YardaHecto= (double) Math.round(YardaHecto);
        YardaDeca= (double) Math.round(YardaDeca);
        YardaMetro= (double) Math.round(YardaMetro);
        YardaDeci= (double) Math.round(YardaDeci);
        YardaCenti= (double) Math.round(YardaCenti);
        YardaMili= (double) Math.round(YardaMili);
        YardaPulgada= (double) Math.round(YardaPulgada);
        YardaPies= (double) Math.round(YardaPies);
        YardaMilla= (double) Math.round(YardaMilla);
        JOptionPane.showMessageDialog(null,
        "Tus "+valor+" yd, equivalen a : " +
        "\n "+YardaKilo + " Kilometros (km)."+
        "\n "+YardaHecto+ " Hectometros (hm)."+
        "\n "+YardaDeca+ " Decametros (dam)."+
        "\n "+YardaMetro+ " Metros (m)."+
        "\n "+YardaDeci+" Decimetros (dm)."+
        "\n "+YardaCenti+ "Centimetros (cm)."+
        "\n "+YardaMili+ " Milimetros (mm)."+
        "\n "+YardaPulgada+ " Pulgadas (in)."+
        "\n "+YardaPies+ " Pies (ft)."+
        "\n "+YardaMilla+ " Millas (mi).",
        valor + " Yarda a: ", 1);
    }

    public void ConvertirPiesAVarios(double valor) {
        double PiesKilo = (valor / 3281);
        double PiesHecto = (valor / 328.1);
        double PiesDeca = (valor / 32.808);
        double PiesMetro = (valor / 3.281);
        double PiesDeci  = (valor * 3.048);
        double PiesCenti = (valor * 30.48);
        double PiesMili = valor * 304.8;
        double PiesPulgada = valor * 12;
        double PiesYarda = valor / 3;
        double PiesMilla = valor / 5280;
        PiesKilo= (double) Math.round(PiesKilo);
        PiesHecto= (double) Math.round(PiesHecto);
        PiesDeca= (double) Math.round(PiesDeca);
        PiesMetro= (double) Math.round(PiesMetro);
        PiesDeci= (double) Math.round(PiesDeci);
        PiesCenti= (double) Math.round(PiesCenti);
        PiesMili= (double) Math.round(PiesMili);
        PiesPulgada= (double) Math.round(PiesPulgada);
        PiesYarda= (double) Math.round(PiesYarda);
        PiesMilla= (double) Math.round(PiesMilla);
        JOptionPane.showMessageDialog(null,
        "Tus "+valor+"ft, equivalen a : " +
        "\n "+PiesKilo + " Kilometros (km)."+
        "\n "+PiesHecto+ " Hectometros (hm)."+
        "\n "+PiesDeca+ " Decametros (dam)."+
        "\n "+PiesMetro+ " Metros (m)."+
        "\n "+PiesDeci+" Decimetros (dm)."+
        "\n "+PiesCenti+ "Centimetros (cm)."+
        "\n "+PiesMili+ " Milimetros (mm)."+
        "\n "+PiesPulgada+ " Pulgadas (in)."+
        "\n "+PiesYarda+ " Yardas (yd)."+
        "\n "+PiesMilla+ " Millas (mi).",
        valor + " Pies a: ", 1);
    }

    public void ConvertirMillaAVarios(double valor) {
        double MillaKilo = (valor * 1.609);
        double MillaHecto = (valor * 16.093);
        double MillaDeca = (valor * 160.9);
        double MillaMetro = (valor * 1609);
        double MillaDeci  = (valor * 16090);
        double MillaCenti = (valor * 160900);
        double MillaMili = valor * 1609000;
        double MillaPulgada = valor * 63360;
        double MillaYarda = valor * 1760;
        double MillaPie = valor * 5280;
        MillaKilo= (double) Math.round(MillaKilo);
        MillaHecto= (double) Math.round(MillaHecto);
        MillaDeca= (double) Math.round(MillaDeca);
        MillaMetro= (double) Math.round(MillaMetro);
        MillaDeci= (double) Math.round(MillaDeci);
        MillaCenti= (double) Math.round(MillaCenti);
        MillaMili= (double) Math.round(MillaMili);
        MillaPulgada= (double) Math.round(MillaPulgada);
        MillaYarda= (double) Math.round(MillaYarda);
        MillaPie= (double) Math.round(MillaPie);
        JOptionPane.showMessageDialog(null,
        "Tus "+valor+"mi, equivalen a : " +
        "\n "+MillaKilo + " Kilometros (km)."+
        "\nTus "+MillaHecto+ " Hectometros (hm)."+
        "\nTus "+MillaDeca+ " Decametros (dam)."+
        "\nTus "+MillaMetro+ " Metros (m)."+
        "\nTus "+MillaDeci+" Decimetros (dm)."+
        "\nTus "+MillaCenti+ "Centimetros (cm)."+
        "\nTus "+MillaMili+ " Milimetros (mm)."+
        "\nTus "+MillaPulgada+ " Pulgadas (in)."+
        "\nTus "+MillaYarda+ " Yardas (yd)."+
        "\nTus "+MillaPie+ " Millas (mi).",
        valor + " Milla a: ", 1);
    }
    
    

    
}
