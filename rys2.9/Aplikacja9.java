import javax.swing.*;

public class Aplikacja9
{
    private static void zrobOkno()
    {
        JFrame okno = new JFrame( "Aplikacja" );
        okno.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        okno.setContentPane( new PanelObszarTekstu() );

        okno.setBounds( 100, 50, 300, 150 );
        okno.setVisible( true );
    }

    public static void main( String[] args )
    {
        javax.swing.SwingUtilities.invokeLater( new Runnable()
        {
            public void run() {
                zrobOkno();
            }
        } );
    }
}