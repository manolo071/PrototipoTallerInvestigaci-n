package com.example.sistemadecontrolagua;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ChatBotActivity extends AppCompatActivity {

    private LinearLayout messagesContainer;
    private EditText editTextMessage;
    private Button btnSend;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot);

        messagesContainer = findViewById(R.id.messages_container);
        editTextMessage = findViewById(R.id.edit_text_message);
        btnSend = findViewById(R.id.btn_send);
        scrollView = findViewById(R.id.scroll_view);

        if (messagesContainer == null || editTextMessage == null || btnSend == null || scrollView == null) {
            Log.e("ChatBotActivity", "Algunos elementos de la interfaz de usuario son nulos");
            return;
        }

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });
    }

    private void sendMessage() {
        Log.d("ChatBotActivity", "sendMessage() llamado");
        String messageText = editTextMessage.getText().toString().trim();
        if (!messageText.isEmpty()) {
            Log.d("ChatBotActivity", "El mensaje no está vacío: " + messageText);

            // Crear y añadir mensaje del usuario
            CardView userMessageCard = new CardView(this);
            userMessageCard.setCardBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
            userMessageCard.setRadius(15);
            userMessageCard.setContentPadding(16, 16, 16, 16);

            TextView userMessage = new TextView(this);
            userMessage.setText(messageText);
            userMessage.setTextColor(getResources().getColor(android.R.color.white));
            userMessageCard.addView(userMessage);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            layoutParams.setMargins(16, 8, 16, 8);
            userMessageCard.setLayoutParams(layoutParams);

            messagesContainer.addView(userMessageCard);

            editTextMessage.setText(""); // Limpiar el campo de texto

            // Desplazarse hacia abajo para mostrar el último mensaje
            scrollView.post(new Runnable() {
                @Override
                public void run() {
                    scrollView.fullScroll(ScrollView.FOCUS_DOWN);
                }
            });

            // Simular respuesta del chatbot después de un pequeño retraso (simulando procesamiento)
            simulateChatbotResponse(messageText);
        } else {
            Log.d("ChatBotActivity", "El mensaje está vacío");
        }
    }

    private void simulateChatbotResponse(String userMessage) {
        Log.d("ChatBotActivity", "simulateChatbotResponse() llamado");

        // Determinar la respuesta del chatbot basado en el mensaje del usuario
        String chatbotResponse;
        switch (userMessage.toLowerCase()) {
            case "necesito ayuda":
                chatbotResponse = "¡Claro que sí! ¿Cómo te puedo ayudar?";
                break;
            case "cual es el ph del agua el dia de hoy":
                chatbotResponse = "El pH suele estar entre 6.5 y 8.5, está apto para el consumo.";
                break;
            case "cual es la calidad del agua el dia de hoy":
                chatbotResponse = "La calidad del agua para hoy es de poco mala, esto es causado a las lluvias.";
                break;
            default:
                chatbotResponse = "Hola, soy el chatbot. ¿En qué puedo ayudarte?";
                break;
        }

        CardView botMessageCard = new CardView(this);
        botMessageCard.setCardBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        botMessageCard.setRadius(15);
        botMessageCard.setContentPadding(16, 16, 16, 16);

        TextView botMessage = new TextView(this);
        botMessage.setText(chatbotResponse);
        botMessage.setTextColor(getResources().getColor(android.R.color.white));
        botMessageCard.addView(botMessage);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(16, 8, 16, 8);
        botMessageCard.setLayoutParams(layoutParams);

        messagesContainer.addView(botMessageCard); // Añadir mensaje del chatbot al contenedor de mensajes

        // Desplazarse hacia abajo para mostrar el último mensaje
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });
    }
}

