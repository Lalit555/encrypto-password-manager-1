package com.skdevstudio.encrypto

import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.skdevstudio.encrypto.databinding.ActivityAddIdsBinding
import com.skdevstudio.encrypto.databinding.ActivityShowIdsBinding

class ShowIDs : AppCompatActivity() {

    private lateinit var binding: ActivityShowIdsBinding
    private lateinit var accountType : ArrayList<String>
    private lateinit var username : ArrayList<String>
    private lateinit var password : ArrayList<String>
    private lateinit var customAdapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowIdsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        accountType = ArrayList()
        username = ArrayList()
        password = ArrayList()

        readAndStoreDataToArray()
        binding.credentialDataRv.adapter = customAdapter
        binding.credentialDataRv.layoutManager = LinearLayoutManager(this)


    }

    private fun readAndStoreDataToArray(){
        var query = "SELECT * FROM USERDATA"
        var helper = DBHelper(applicationContext)
        var db = helper.readableDatabase

        var cursor : Cursor? = null
        if(db != null){
            cursor = db.rawQuery(query,null)
        }

        if(cursor?.count == 0){
            Toast.makeText(this, "No Data Available!", Toast.LENGTH_SHORT).show()
        }else{
            if (cursor != null) {
                while(cursor.moveToNext()){
                    accountType.add(cursor.getString(1))
                    username.add(cursor.getString(2))
                    password.add(cursor.getString(3))
                }
            }
        }
        customAdapter = CustomAdapter(this,accountType,username,password)
        customAdapter.setOnItemClickListener(object : CustomAdapter.onItemClickListner{
            override fun onItemClick(position: Int) {
            }
        })

    }

    public fun toast(str : String){
        Toast.makeText(this, "$str", Toast.LENGTH_SHORT).show()
    }

}