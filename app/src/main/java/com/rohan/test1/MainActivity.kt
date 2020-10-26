package com.rohan.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.io.File
import java.nio.file.FileSystem
import kotlin.math.floor

class MainActivity : AppCompatActivity() {
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btn0: Button
    lateinit var btnAC: Button
    lateinit var btnBack: Button
    lateinit var btnDivide: Button
    lateinit var btnMultiply: Button
    lateinit var btnPlus: Button
    lateinit var btnMinus: Button
    lateinit var btnPoint: Button
    lateinit var btnEqualTo: Button
    lateinit var txtInput: TextView
    var num1:Double = 0.0
    var ans:Double = 0.0
    var isNum1:Boolean = false
    var y=0
    var x = 0
    var isPoint = false
    var isAns = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout1)
        btn0 = findViewById(R.id.btn0)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btnAC = findViewById(R.id.btnAc)
        btnBack = findViewById(R.id.btnBack)
        btnDivide = findViewById(R.id.btnDivide)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnMinus = findViewById(R.id.btnMinus)
        btnPlus = findViewById(R.id.btnPlus)
        btnEqualTo = findViewById(R.id.btnEqualTo)
        btnPoint = findViewById(R.id.btnPoint)
        txtInput = findViewById(R.id.txtInput)
        btn0.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            txtInput.setText(txtInput.text.toString() + 0)
        }
        btn1.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            txtInput.setText(txtInput.text.toString() + 1)
        }
        btn2.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            txtInput.setText(txtInput.text.toString() + 2)
        }
        btn3.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            txtInput.setText(txtInput.text.toString() + 3)
        }
        btn4.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            txtInput.setText(txtInput.text.toString() + 4)
        }
        btn5.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            txtInput.setText(txtInput.text.toString() + 5)
        }
        btn6.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            txtInput.setText(txtInput.text.toString() + 6)
        }
        btn7.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            txtInput.setText(txtInput.text.toString() + 7)
        }
        btn8.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            txtInput.setText(txtInput.text.toString() + 8)
        }
        btn9.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            txtInput.setText(txtInput.text.toString() + 9)
        }
        btnMinus.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            if(!isNum1&&txtInput.text.toString()!=""){
                ans = txtInput.text.toString().toDouble()
                isNum1 = true
                x = 1
                isPoint = false
                txtInput.setText(txtInput.text.toString() + "-")
                y = txtInput.text.toString().length
            }else if(txtInput.text.toString()==""){
                Toast.makeText(application,"Please enter a number", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(application,"Only one operation allowed at a time", Toast.LENGTH_SHORT).show()
            }
        }
        btnPlus.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            if(!isNum1&&txtInput.text.toString()!=""){
                ans = txtInput.text.toString().toDouble()
                isNum1 = true
                x=2
                isPoint = false
                txtInput.setText(txtInput.text.toString() + "+")
                y = txtInput.text.toString().length
            }else if(txtInput.text.toString()==""){
                Toast.makeText(application,"Please enter a number", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(application,"Only one operation allowed at a time", Toast.LENGTH_SHORT).show()
            }
        }
        btnMultiply.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            if(!isNum1&&txtInput.text.toString()!=""){
                ans = txtInput.text.toString().toDouble()
                isNum1 = true
                x=3
                isPoint = false
                txtInput.setText(txtInput.text.toString() + "*")
                y = txtInput.text.toString().length
            }else if(txtInput.text.toString()==""){
                Toast.makeText(application,"Please enter a number", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(application,"Only one operation allowed at a time", Toast.LENGTH_SHORT).show()
            }
        }
        btnDivide.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            if(!isNum1&&txtInput.text.toString()!=""){
                ans = txtInput.text.toString().toDouble()
                isNum1 = true
                x=4
                isPoint = false
                txtInput.setText(txtInput.text.toString() + "%")
                y = txtInput.text.toString().length
            }else if(txtInput.text.toString()==""){
                Toast.makeText(application,"Please enter a number", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(application,"Only one operation allowed at a time", Toast.LENGTH_SHORT).show()
            }
        }
        btnEqualTo.setOnClickListener {
            if(isNum1&&txtInput.text.toString()!=""&&(txtInput.text.toString().last()!='+'&&txtInput.text.toString().last()!='-'&&txtInput.text.toString().last()!='*'&&txtInput.text.toString().last()!='%')) {
                var ans2 = txtInput.text.toString().substring(y,txtInput.text.toString().length).toDouble()
                when (x) {
                    1 -> {
                        ans -=ans2
                        if (ans == Math.floor(ans)&&ans!=Double.POSITIVE_INFINITY&&ans!=Double.NEGATIVE_INFINITY&&ans!=Double.MAX_VALUE&&ans!= Double.MIN_VALUE){
                            txtInput.setText(ans.toInt().toString())
                        }else {
                            ans = "%.2f".format(ans).toDouble()
                            txtInput.setText(ans.toString())
                        }
                    }
                    2 -> {
                        ans +=ans2
                        if (ans == Math.floor(ans)&&ans!=Double.POSITIVE_INFINITY&&ans!=Double.NEGATIVE_INFINITY&&ans!=Double.MAX_VALUE&&ans!= Double.MIN_VALUE){
                            txtInput.setText(ans.toInt().toString())
                        }else {
                            ans = "%.2f".format(ans).toDouble()
                            txtInput.setText(ans.toString())
                        }
                    }
                    3 -> {
                        ans *=ans2
                        if (ans == Math.floor(ans)&&ans!=Double.POSITIVE_INFINITY&&ans!=Double.NEGATIVE_INFINITY&&ans!=Double.MAX_VALUE&&ans!= Double.MIN_VALUE){
                            txtInput.setText(ans.toInt().toString())
                        }else {
                            ans = "%.2f".format(ans).toDouble()
                            txtInput.setText(ans.toString())
                        }
                    }
                    4 -> {
                        ans /=ans2
                        if (ans == Math.floor(ans)&&ans!=Double.POSITIVE_INFINITY&&ans!=Double.NEGATIVE_INFINITY&&ans!=Double.MAX_VALUE&&ans!= Double.MIN_VALUE){
                            txtInput.setText(ans.toInt().toString())
                        }else {
                            ans = "%.2f".format(ans).toDouble()
                            txtInput.setText(ans.toString())
                        }
                    }
                }
                isNum1 = false
                x=0
                y=0
                num1 = 0.0
                ans = 0.0
                isPoint = false
                isAns = true
            }else if(txtInput.text.toString()==""||(txtInput.text.toString().last()=='+'||txtInput.text.toString().last()=='-'||txtInput.text.toString().last()=='*'||txtInput.text.toString().last()=='%')){
                Toast.makeText(application,"Please enter a number", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(application,"Please select an operation to execute", Toast.LENGTH_SHORT).show()
            }
        }
        btnPoint.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            if(!isPoint) {
                txtInput.setText(txtInput.text.toString() + ".")
                isPoint = true
            }
        }
        btnAC.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            isNum1 = false
            x=0
            y=0
            num1 = 0.0
            ans = 0.0
            isPoint = false
            txtInput.setText(txtInput.text.toString().removeRange(0,txtInput.text.toString().length))
        }
        btnBack.setOnClickListener {
            if(isAns){
                txtInput.setText("")
                isAns = false
            }
            isNum1 = false
            x=0
            y=0
            num1 = 0.0
            ans = 0.0
            if (txtInput.text.toString()!=""&&(txtInput.text.toString().toDouble() == floor(txtInput.text.toString().toDouble()))&&(txtInput.text.toString().last()!='+'&&txtInput.text.toString().last()!='-'&&txtInput.text.toString().last()!='*'&&txtInput.text.toString().last()!='%')) {
                isPoint = false
            }
            if(txtInput.text.toString()!="") {
                txtInput.setText(
                    txtInput.text.toString().removeRange(
                        txtInput.text.toString().length - 1,
                        txtInput.text.toString().length
                    )
                )
            }else if(txtInput.text.toString()==""){
                Toast.makeText(application,"No number entered", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
