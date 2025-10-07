package guilherme26bc.com.github.navegacao_entre_telas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import guilherme26bc.com.github.navegacao_entre_telas.screens.LoginScreen
import guilherme26bc.com.github.navegacao_entre_telas.screens.MenuScreen
import guilherme26bc.com.github.navegacao_entre_telas.screens.PedidosScreen
import guilherme26bc.com.github.navegacao_entre_telas.ui.theme.Navegacao_entre_telasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Navegacao_entre_telasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginScreen(modifier = Modifier.padding((innerPadding)))
                }
            }
        }
    }
}