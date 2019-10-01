package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.dummy.DummyContent

class MainActivity : AppCompatActivity(),ItemFragment.OnListFragmentInteractionListener {
    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var item=DummyContent.DummyItem("1","item 1",20,3)
        DummyContent.ITEMS.add(item)
        DummyContent.ITEM_MAP.put(item.id, item)

        var item1=DummyContent.DummyItem("2","item 2",25,4)
        DummyContent.ITEMS.add(item1)
        DummyContent.ITEM_MAP.put(item1.id, item1)


        MyItemRecyclerViewAdapter.adapter?.notifyDataSetChanged()








    }
}
