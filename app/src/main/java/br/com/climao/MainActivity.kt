package br.com.climao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.climao.ui.screens.BuscarScreen
import br.com.climao.ui.screens.InicialScreen
import br.com.climao.ui.screens.ResultadoBusca
import br.com.climao.ui.theme.ClimaoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClimaoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //InicialScreen()

                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "inicial"
                    ) {
                        composable(route = "inicial"){InicialScreen(navController)}
                        composable(route = "busca"){ BuscarScreen(navController)}
                        composable("resultado"){ ResultadoBusca(navController)}
                    }
                }
            }
        }
    }
}

