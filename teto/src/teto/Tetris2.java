import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tetris2 extends Applet implements Runnable, KeyListener {

    private int x,y;
    private long SPEED=600;
    private int block=10;
    private int width=100,height=200;
    private int margin=10;
    private int xx,yy;

    private boolean[][] Status;

    private Graphics offG;
    private Image img;
    private Thread th;

    public void init() {
        setSize(200,270);
        setLayout(null);
        img = createImage(width,height);
        offG = img.getGraphics();

        addKeyListener(this);
        requestFocus();

        x=width/block;
        y=height/block;

        Status = new boolean[x][y+1];

        for(int i=0;i<x;i++) {
            for(int j=0;j<y;j++) {
                Status[i][j] = true;
            }
        }

        xx=0;
    }

    public void start() {
        if(th==null) {
            th = new Thread(this);
            th.start();
        }
    }

    public void paint(Graphics G) {
        offG.clearRect(0,0,width,height);
        offG.setColor(Color.gray);
        offG.fillRect(0,0,width,height);

        offG.setColor(Color.green);
        offG.fillRect(xx,yy,block*4,block);

        for(int i=0;i<x;i++) {
            for(int j=0;j<y;j++) {
                if(Status[i][j]==false) {
                    offG.fillRect(i*block*4,j*block,block*4,block);
                }
            }
        }

        G.drawImage(img,margin,margin,this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT) {
            if(xx>=block) {
                xx-=block;
            }
        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(xx<width-block) {
                xx+=block;
            }
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void run() {
        while(th == Thread.currentThread()) {
            try {
                Thread.sleep(SPEED);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
            yy += block;
            if(Status[xx/block][yy/block]==false) {
                Status[xx/block][yy/block-1]=false;
                yy=0;
            }
        }
    }
}
