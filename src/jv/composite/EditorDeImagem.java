package jv.composite;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public final class EditorDeImagem {
    private final EditorCanvas canvas;
    private final FormaComposta todasFormas = FormaComposta.criarFormaComposta();

    private EditorDeImagem() {
        canvas = new EditorCanvas();
    }

    public static EditorDeImagem criarEditorImagem() {
        return new EditorDeImagem();
    }

    public void carregarFormas(Forma... formas) {
        todasFormas.limpar();
        todasFormas.adicionar(formas);
        canvas.refresh();
    }

    private class EditorCanvas extends Canvas {
        private static final int PADDING = 10;
        JFrame frame;

        EditorCanvas() {
            createFrame();
            refresh();
            addMouseListener(new MyMouseAdapter());
        }

        void createFrame() {
            frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JPanel contentPanel = new JPanel();
            Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
            contentPanel.setBorder(padding);
            frame.setContentPane(contentPanel);

            frame.add(this);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        }

        public int getWidth() {
            return todasFormas.getX() + todasFormas.getLargura() + PADDING;
        }

        public int getHeight() {
            return todasFormas.getY() + todasFormas.getAltura() + PADDING;
        }

        void refresh() {
            this.setSize(getWidth(), getHeight());
            frame.pack();
        }

        public void paint(Graphics graphics) {
            todasFormas.pintar(graphics);
        }

        private class MyMouseAdapter extends MouseAdapter {
            @Override
            public void mousePressed(MouseEvent e) {
                todasFormas.unSelect();
                todasFormas.selectChildAt(e.getX(), e.getY());
                e.getComponent().repaint();
            }
        }
    }
}