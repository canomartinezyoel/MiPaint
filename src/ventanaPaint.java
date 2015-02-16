
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoel Cano.
 */
public class ventanaPaint extends javax.swing.JFrame {
    
    //creamos una variable de tipo linea
    //para guardar la linea que dibuja el usuario
    Line2D.Double linea = new Line2D.Double();
    
    //creamos una variable de tipo circulo
    //para guardar el circulo que dibuja el usuario
    Ellipse2D.Double circulo = new Ellipse2D.Double();
    
    //creamos una variable de tipo rectángulo
    //para guardar el rectángulo que dibuja el usuario
    Rectangle2D.Double rectangulo = new Rectangle2D.Double();
    
    //creamos una variable de tipo int para el switch.
    int swt;
    
    //creamos una variable de tipo BufferedImage
    //para almacenar una imagen
    private BufferedImage buffer = null;
    
    //almacena el color seleccionado
    Color colorSeleccionado = Color.black;
    
   
    public ventanaPaint() {
        initComponents();
        
        //el tamaño de la ventana
        jDialog1.setSize(800, 600);
        
        //defino el ancho y el alto del jPanel
        int anchoPanel = jPanel1.getWidth();
        int altoPanel = jPanel1.getHeight();
        
        //enlazo el buffer al jPanel
        buffer = (BufferedImage) jPanel1.createImage(anchoPanel,altoPanel);
        
        //inicializa el buffer para que sea de color blanco
        Graphics2D g2 = buffer.createGraphics();
        g2.setColor(Color.white);
        g2.fillRect(0, 0, anchoPanel, altoPanel);
    }
    
    @Override
    public void paint (Graphics g){
        //llamo al paintComponents de la clase jFrame
        //para que se pinten bien los objetos de la aplicación
        super.paintComponents(g);
        
        //a continuación apunto al jPanel
        Graphics2D g2 = (Graphics2D) jPanel1.getGraphics();
        
        //pinto el buffer sobre el jPanel
        g2.drawImage (buffer, 0, 0, null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Linea = new javax.swing.JButton();
        Rectangulo = new javax.swing.JButton();
        LineaDiscontinua = new javax.swing.JButton();
        CirculoDiscontinuo = new javax.swing.JButton();
        RectanguloDiscontinuo = new javax.swing.JButton();
        CirculoRelleno = new javax.swing.JButton();
        RectanguloColor = new javax.swing.JButton();
        Circulo = new javax.swing.JButton();
        ControlGrosor = new javax.swing.JSlider();
        CambiaColor = new javax.swing.JButton();

        jButton4.setText("Aceptar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        jButton5.setText("Cancelar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton4)
                        .addGap(128, 128, 128)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(44, 44, 44))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        Linea.setBackground(new java.awt.Color(255, 255, 255));
        Linea.setText("Linea");
        Linea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Linea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LineaMousePressed(evt);
            }
        });

        Rectangulo.setBackground(new java.awt.Color(255, 255, 255));
        Rectangulo.setText("Rectángulo");
        Rectangulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Rectangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RectanguloMousePressed(evt);
            }
        });

        LineaDiscontinua.setBackground(new java.awt.Color(255, 255, 255));
        LineaDiscontinua.setText("Linea Disc.");
        LineaDiscontinua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LineaDiscontinua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LineaDiscontinuaMousePressed(evt);
            }
        });

        CirculoDiscontinuo.setBackground(new java.awt.Color(255, 255, 255));
        CirculoDiscontinuo.setText("Círculo Dis.");
        CirculoDiscontinuo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CirculoDiscontinuo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CirculoDiscontinuoMousePressed(evt);
            }
        });

        RectanguloDiscontinuo.setBackground(new java.awt.Color(255, 255, 255));
        RectanguloDiscontinuo.setText("Rectángulo Dis.");
        RectanguloDiscontinuo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RectanguloDiscontinuo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RectanguloDiscontinuoMousePressed(evt);
            }
        });

        CirculoRelleno.setBackground(new java.awt.Color(255, 255, 255));
        CirculoRelleno.setForeground(new java.awt.Color(0, 51, 0));
        CirculoRelleno.setText("Círculo Color");
        CirculoRelleno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CirculoRelleno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CirculoRellenoMousePressed(evt);
            }
        });

        RectanguloColor.setBackground(new java.awt.Color(255, 255, 255));
        RectanguloColor.setText("Réctangulo Color");
        RectanguloColor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RectanguloColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RectanguloColorMousePressed(evt);
            }
        });

        Circulo.setBackground(new java.awt.Color(255, 255, 255));
        Circulo.setText("Círculo");
        Circulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Circulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CirculoMousePressed(evt);
            }
        });

        ControlGrosor.setBackground(new java.awt.Color(255, 255, 255));
        ControlGrosor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ControlGrosor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ControlGrosorMousePressed(evt);
            }
        });

        CambiaColor.setBackground(new java.awt.Color(255, 255, 255));
        CambiaColor.setForeground(new java.awt.Color(204, 255, 0));
        CambiaColor.setText("Color");
        CambiaColor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CambiaColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CambiaColorMousePressed(evt);
            }
        });
        CambiaColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiaColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RectanguloColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Linea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Rectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CirculoDiscontinuo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LineaDiscontinua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Circulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(CirculoRelleno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RectanguloDiscontinuo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(CambiaColor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ControlGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CambiaColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ControlGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Linea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Circulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Rectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LineaDiscontinua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CirculoDiscontinuo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RectanguloDiscontinuo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CirculoRelleno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RectanguloColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        
        //utilizamos un switch para ir seleccionando los tipos de 
        //dibujo que queremos hacer cuando pulsamos el botón del ratón.
        switch (swt) {
            //nombramos el primer caso ("1") y metemos en el lo que queremos
            //que se ejecute, en este la linea
            case 1:
            

                //empieza a dibujar la linea
                //así que almaceno en x1 y1 el punto inicial donde se ha producido
                //el evento y en x2 y2 el punto final.
                linea.x1 = evt.getX();
                linea.x2 = evt.getX();
                linea.y1 = evt.getY();
                linea.y2 = evt.getY();
  
                //para terminar el primer caso lo hacemos con un "break"
                break;
            
            //nombramos el segundo caso ("2) y metemos en el lo que queremos
            //que se ejecute, en este el círculo
            case 2:
                //empezamos a dibujar el círculo y para ello cambiamos las
                //coordenadas del punto inicial y final
                //almaceno en x1 y1 el punto inicial y en width y height
                //el punto final de las coordenadas x e y respectivamente
                circulo.x = evt.getX();
                circulo.y = evt.getY();
                circulo.width = evt.getX();
                circulo.height = evt.getY();

                //para terminar el segundo caso hacemos otro "break"
                break;
                
            case 3:
                //empezamos a dibujar el rectángulo y para ello cambiamos las
                //coordenadas del punto inicial y final
                //como en el caso anterior los puntos inicial y final son
                // "x1 y1" y width height respectivamente
                rectangulo.x = evt.getX();
                rectangulo.y = evt.getY();
                rectangulo.height = evt.getY();
                rectangulo.width = evt.getX();

                //para terminar el tercer caso hacemos otro "break"
                break;
                
            case 4:
                //empezamos a dibujar la linea discontinua, copiamos y
                //pegamos el caso 1
                linea.x1 = evt.getX();
                linea.y1 = evt.getY();
                linea.x2 = evt.getX();
                linea.y2 = evt.getY();

                //para terminar el cuarto case hacemos otro "break"
                break;
                
            case 5:
                //empezamos a dibujar el circulo discontinuo, copiamos y
                //pegamos el caso 2
                circulo.x = evt.getX();
                circulo.width = evt.getX();
                circulo.y = evt.getY();
                circulo.height = evt.getY();

                //para terminar el quinto case hacemos otro "break"
                break;
                
            case 6:
                //empezamos a dibujar el rectángulo discontinuo, copiamos y
                //pegamos el caso 3
                rectangulo.x = evt.getX();
                rectangulo.y = evt.getY();
                rectangulo.height = evt.getY();
                rectangulo.width = evt.getX();

                //para terminar el sexto case hacemos otro "break"
                break;
                
            case 7:
                //empezamos a dibujar el circulo relleno, copiamos y
                //pegamos el caso 2
                circulo.x = evt.getX();
                circulo.width = evt.getX();
                circulo.y = evt.getY();
                circulo.height = evt.getY();
  
                //para terminar el séptimo case hacemos otro "break"
                break;
                
            case 8:
                //empezamos a dibujar el rectángulo relleno, copiamos y
                //pegamos el caso 3
                rectangulo.x = evt.getX();
                rectangulo.y = evt.getY();
                rectangulo.width = evt.getX();
                rectangulo.height = evt.getY();
 
                //para terminar el octavo case hacemos otro "break"
                break;
 
        }    
            //apunta al jPanel
            Graphics2D g2 = (Graphics2D) jPanel1.getGraphics();
            g2.draw(linea);
                
        
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        //apunta al jPanel
        Graphics2D g2 = (Graphics2D) jPanel1.getGraphics();
        //borro el jPanel con lo que hay en el buffer
        g2.drawImage(buffer, 0, 0, null);
        
        switch (swt){
            //en cada caso lo que hacemos ahora es cambiar el punto de
            //destino, para que se produzca el evento arrastre.
            
            case 1:
                //para el primer case lo hacemos con la linea
                linea.x2 = evt.getX();
                linea.y2 = evt.getY();
                
                //utilizamos la siguiente función para el grosor
                g2.setStroke(new BasicStroke(ControlGrosor.getValue()));
                
                //así como el color
                g2.setColor(colorSeleccionado);
                
                //y pinto la linea
                g2.draw(linea);

                //hacemos un "break" para pasar al siguiente case
                break;
            
            case 2:
                //para el segundo case lo hacemos con el círculo
                circulo.width = evt.getX() - circulo.x;
                circulo.height = evt.getY() - circulo.y;
                
                //añado el mismo código anterior para el grosor
                g2.setStroke(new BasicStroke(ControlGrosor.getValue()));
                
                //los mismo para el color
                g2.setColor(colorSeleccionado);
                
                //y pinto el círculo
                g2.draw(circulo);

                //hacemos un "break" para pasar al siguiente case
                break;
                
            case 3:
                //para el tercer case lo hacemos con el rectángulo
                rectangulo.height = evt.getY() - rectangulo.y;
                rectangulo.width = evt.getX() - rectangulo.x;
                
                //añado el mismo código anterior para el grosor
                g2.setStroke(new BasicStroke(ControlGrosor.getValue()));
                
                //los mismo para el color
                g2.setColor(colorSeleccionado);
                
                //y pinto el rectángulo
                g2.draw(rectangulo);

                //hacemos un "break" para pasar al siguiente case
                break;
                
            case 4:
                //hago para este caso la linea discontinua
                float lineaDiscontinua[] = {10.0f};
                g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f,lineaDiscontinua, 0.0f));
                
                //cambio el punto de destino
                linea.x2 = evt.getX();
                linea.y2 = evt.getY();
                
                //el color        
                g2.setColor(colorSeleccionado);
                
                //pinto la linea
                g2.draw(linea);
 
                //hacemos un "break" para pasar al siguiente case
                break;
                
            case 5:
                //hago para este caso el círculo discontinuo
                float circuloDiscontinuo[] = {10.0f};
                g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f,circuloDiscontinuo, 0.0f));
                
                //cambio el punto de destino
                circulo.height = evt.getY();
                circulo.width = evt.getX();

                //el color
                g2.setColor(colorSeleccionado);
                
                //pinto el círculo
                g2.draw(circulo);

                //hacemos un "break" para pasar al siguiente case
                break;
                
            case 6:
                //hago para este caso el rectángulo discontinuo
                float rectanguloDiscontinuo[] = {10.0f};
                g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f,rectanguloDiscontinuo, 0.0f));
                
                //cambio el punto de destino
                rectangulo.height = evt.getY();
                rectangulo.width = evt.getX();
 
                //el color
                g2.setColor(colorSeleccionado);
                
                //pinto el círculo
                g2.draw(rectangulo);
   
                //hacemos un "break" para pasar al siguiente case
                break;
                
            case 7:
                //hago para este caso el circulo relleno, para ello
                //cambio el punto de destino
                circulo.height = evt.getY();
                circulo.width = evt.getX();

                //el color
                g2.setColor(colorSeleccionado);
                
                //creo el circulo relleno
                g2.fill(circulo);
                
                //pinto el círculo relleno
                g2.draw(circulo);

                //hacemos un "break" para pasar al siguiente case
                break;
                
            case 8:
                //hago para este caso el rectangulo relleno, para ello
                //cambio el punto de destino
                rectangulo.height = evt.getY();
                rectangulo.width = evt.getX();

                //el color
                g2.setColor(colorSeleccionado);
                
                //creo el rectangulo relleno
                g2.fill(rectangulo);
                
                //pinto el rectangulo relleno
                g2.draw(rectangulo);

                //hacemos un "break" para pasar al siguiente case
                break;
 
        }
              
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        //apunta al buffer
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        
        //pinto de nuevo todo al igual que en el método del MouseDragged
        //pero en este caso lo hago sobre el buffer
        
        switch (swt){
            //voy creando los mismos "cases" que en el MouseDragged con los
            //diferentes tipos para pintar
            case 1:
                
                linea.x2 = evt.getX();
                linea.y2 = evt.getY();        
                
                //pinto la linea en el buffer
                g2.setStroke(new BasicStroke(ControlGrosor.getValue()));
                
                g2.setColor(colorSeleccionado);
                g2.draw(linea);   

                break;
                
            case 2: 
                
                //circulo.height = evt.getY();
                //circulo.width = evt.getX();

                //pinto el círculo en el buffer
                g2.setStroke(new BasicStroke(ControlGrosor.getValue()));
                
                g2.setColor(colorSeleccionado);
                g2.draw(circulo);

                break;
                
            case 3:
                //rectangulo.height = evt.getY();
                //rectangulo.width = evt.getX();

                //pinto la linea en el buffer
                g2.setStroke(new BasicStroke(ControlGrosor.getValue()));
                
                g2.setColor(colorSeleccionado);
                g2.draw(rectangulo);
   
                break;
                
            case 4:
                
                float lineaDiscontinua[] = {10,0f};
                g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f,lineaDiscontinua, 0.0f));
                
                linea.x2 = evt.getX();
                linea.y2 = evt.getY();
                
                g2.setColor(colorSeleccionado);
                g2.draw(linea);

                break;
                
            case 5:
                
                float circuloDiscontinuo[] = {10,0f};
                g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f,circuloDiscontinuo, 0.0f));
                circulo.height = evt.getY();
                circulo.width = evt.getX();
                
                g2.setColor(colorSeleccionado);
                g2.draw(circulo);

                break;
                
            case 6:
                
                float rectanguloDiscontinuo[] = {10,0f};
                g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f,rectanguloDiscontinuo, 0.0f));
                rectangulo.height = evt.getY();
                rectangulo.width = evt.getX();

                g2.setColor(colorSeleccionado);
                g2.draw(rectangulo);

                break;
                
            case 7:
                circulo.height = evt.getY();
                circulo.width = evt.getX();
                
                g2.setColor(colorSeleccionado);
                g2.fill(circulo);
                g2.draw(circulo);

                break;
                
            case 8:
                rectangulo.height = evt.getY();
                rectangulo.width = evt.getX();
                
                g2.setColor(colorSeleccionado);
                g2.fill(rectangulo);
                g2.draw(rectangulo);
                
                break;               
                
        }
        
    }//GEN-LAST:event_jPanel1MouseReleased

    private void CambiaColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiaColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CambiaColorActionPerformed

    private void CambiaColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambiaColorMousePressed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_CambiaColorMousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        //el usuario ha elegido un color
        colorSeleccionado = jColorChooser1.getColor();
        jDialog1.setVisible(false);
        
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton5MousePressed

    private void LineaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineaMousePressed
        //en este caso se ejecuta el "case 1"
        swt = 1;
    }//GEN-LAST:event_LineaMousePressed

    private void RectanguloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RectanguloMousePressed
        //en este caso se ejecuta el "case 3"
        swt = 3;
    }//GEN-LAST:event_RectanguloMousePressed

    private void LineaDiscontinuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineaDiscontinuaMousePressed
        //en este caso se ejecuta el "case 4"
        swt = 4;
    }//GEN-LAST:event_LineaDiscontinuaMousePressed

    private void CirculoDiscontinuoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CirculoDiscontinuoMousePressed
        //en este caso se ejecuta el "case 5"
        swt = 5;
    }//GEN-LAST:event_CirculoDiscontinuoMousePressed

    private void RectanguloDiscontinuoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RectanguloDiscontinuoMousePressed
        //en este caso se ejecuta el "case 6"
        swt = 6;
    }//GEN-LAST:event_RectanguloDiscontinuoMousePressed

    private void CirculoRellenoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CirculoRellenoMousePressed
        //en este caso se ejecuta el "case 7"
        swt = 7;
    }//GEN-LAST:event_CirculoRellenoMousePressed

    private void RectanguloColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RectanguloColorMousePressed
        //en este caso se ejecuta el "case 8"
        swt = 8;
    }//GEN-LAST:event_RectanguloColorMousePressed

    private void CirculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CirculoMousePressed
        //en este caso se ejecuta el "case 2"
        swt = 2;
    }//GEN-LAST:event_CirculoMousePressed

    private void ControlGrosorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ControlGrosorMousePressed
        //este método controla el grosor
        Graphics2D g2 = (Graphics2D) jPanel1.getGraphics();
        
        g2.draw(linea);
        g2.draw(circulo);
        g2.draw(rectangulo);
    }//GEN-LAST:event_ControlGrosorMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiaColor;
    private javax.swing.JButton Circulo;
    private javax.swing.JButton CirculoDiscontinuo;
    private javax.swing.JButton CirculoRelleno;
    private javax.swing.JSlider ControlGrosor;
    private javax.swing.JButton Linea;
    private javax.swing.JButton LineaDiscontinua;
    private javax.swing.JButton Rectangulo;
    private javax.swing.JButton RectanguloColor;
    private javax.swing.JButton RectanguloDiscontinuo;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
