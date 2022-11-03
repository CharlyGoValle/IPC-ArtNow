package mx.tec.testsipc

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MajaVestida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maja_vestida)

        val buyNow = findViewById<Button>(R.id.buyNow)
        val addtoCart = findViewById<Button>(R.id.addToCart)


        buyNow.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setCancelable(false)
                .setTitle("Realizar compra")
                .setMessage("¿Esta seguro que quiere realizar esta compra?")
                .setNegativeButton("No") { dialog, which ->
                    // Respond to negative button press
                }
                .setPositiveButton("Si") { dialog, which ->
                    // Respond to positive button press
                    //CreateDonation(lista)
                    //if check
                    val builder = AlertDialog.Builder(this)
                    builder.setMessage("Felicidades La compra ha sido exitosa")
                    builder.setIcon(R.drawable.cart)
                    builder.setCancelable(false)
                    builder.setPositiveButton("OK") { dialogInterface: DialogInterface, i: Int ->
                        //Do something
                        val intent = Intent(this@MajaVestida, MainPageBuy::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                        startActivity(intent)
                    }
                    builder.show()
                }
                .show()
        }

        addtoCart.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Ha sido agregado al carrito con exito")
            builder.setIcon(R.drawable.cart)
            builder.setCancelable(false)
            builder.setPositiveButton("OK") { dialogInterface: DialogInterface, i: Int ->
                //Do something
                val intent = Intent(this@MajaVestida, MainPageBuy::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
            }
            builder.show()

        }
    }
}