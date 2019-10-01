package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.dummy.DummyContent

class MainActivity : AppCompatActivity(),ItemFragmentFragment.OnListFragmentInteractionListener{
    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DummyContent.ITEMS.add(
            DummyContent.DummyItem("1", "Dinal", " My nANEM IS DINAL"
            )
        )


        DummyContent.ITEMS.add(
            DummyContent.DummyItem("2", "Dinal", " My nANEM IS DINAL"
            )
        )



        MyItemFragmentRecyclerViewAdapter.adapter?.notifyDataSetChanged()

//        var adapter: MyListAdapter? = null

//

//        var lstitm = ArrayList<DummyContent.Employe>()
//        var emp: DummyContent.Employe = DummyContent.Employe()
//        emp.id = 1
//        emp.itemName = "John Clington"
//        emp.price = 20
//        emp.quantity = 4
//
//        lstitm.add(emp)
//
//        DummyContent.empList=lstitm
//
//        MyItemRecyclerViewAdapter.adapter?.notifyDataSetChanged()



//       var val1: Int=editText.text.toString().toInt()
//       var val2: Int=editText2.text.toString().toInt()
//
//        var tcost=val1+val2

       // textView.setText(tcost)

        //adapter = MyListAdapter(this, empList)

//        list.adapter = adapter
//
//        list.setOnItemClickListener { adapterView, view, i, l ->
//            Toast.makeText(this, "Selected Emp is = " + empList.get(i).itemName, Toast.LENGTH_SHORT)
//                .show()
        }


    }




//    class Employe {
//        var id: Int? = 0
//        var itemName: String? = null
//        var price: Int? = null
//        var quantity: Int? = null
//
//    }

//    class MyListAdapter (private var activity: Activity, private var items: ArrayList<Employe>) :  BaseAdapter(){
//        private class ViewHolder(row: View?) {
//            var item_name: TextView? = null
//            var price: TextView? = null
//            var qnt: TextView? = null
//
//            init {
//                this.item_name = row?.findViewById<TextView>(R.id.lbl_name)
//                this.price = row?.findViewById<EditText>(R.id.editText)
//                this.qnt = row?.findViewById<EditText>(R.id.editText2)
//            }
//        }
//        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//            val view: View
//            val viewHolder: ViewHolder
//            if (convertView == null) {
//                val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//                view = inflater.inflate(R.layout.layout_item_second, null)
//                viewHolder = ViewHolder(view)
//                view.tag = viewHolder
//            } else {
//                view = convertView
//                viewHolder = view.tag as ViewHolder
//            }
//            var itm = items[position]
//            viewHolder.item_name?.text = itm.itemName
//            viewHolder.price?.text = itm.price.toString()
//            viewHolder.qnt?.text = itm.quantity.toString()
//
//            var price= viewHolder.price?.text
//            var quantity=viewHolder.qnt?.text
//
//            return view as View
//        }
//        override fun getItem(i: Int): Employe {
//            return items[i]
//        }
//        override fun getItemId(i: Int): Long {
//            return i.toLong()
//        }
//        override fun getCount(): Int {
//            return items.size
//        }
//    }
//}
