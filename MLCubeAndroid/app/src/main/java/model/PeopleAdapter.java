package model;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gonghe.mlcubeandroid.lcrown.mlcubeandroid.R;

import java.util.List;

/**
 * Created by gonghe on 2017/12/27.
 */

//  一定先把Adaper的泛型指定,再生成必须实现的方法,才不会导致类型错误
public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHodler> {

//  创建数组
    private List<PeopleModel> peopleModelList;

    public PeopleAdapter(List<PeopleModel> temPeopleModelList) {

        peopleModelList = temPeopleModelList;

    }

// 创建内部类,继承ViewHolder,初始化方法中引入,items中的自定义控件
   class ViewHodler extends RecyclerView.ViewHolder {

       TextView nameTextView;
       TextView ageTextView;

       public ViewHodler(View itemView) {
           super(itemView);

//           nameTextView = (TextView) itemView.findViewById(R.id.people_item_layout_nametextview);
//           ageTextView = (TextView) itemView.findViewById(R.id.people_item_layout_agetextview);
       }
   }

//  导入viewHodler,进行自定义界面的加载
    @Override
    public ViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        ViewHodler viewHodler = new ViewHodler(view);

        return viewHodler;
    }

//  给viewHodler里面的自定义items里面的控件进行赋值
    @Override
    public void onBindViewHolder(ViewHodler holder, int position) {

        PeopleModel peopleModel = peopleModelList.get(position);
//        holder.nameTextView.setText(peopleModel.getName());
//        holder.ageTextView.setText(peopleModel.getAge());

    }

    /*
    //  给viewHodler里面的自定义items里面的控件进行赋值
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        PeopleModel peopleModel = peopleModelList.get(position);
        //hodler的类型是RecyclerView.ViewHolder,需要指定类型为RecyclerView.ViewHolder的自定义子类的类型,就是29行代码的类
        ViewHodler viewHodler = (ViewHodler) holder;

        viewHodler.nameTextView.setText(peopleModel.getName());
        viewHodler.ageTextView.setText(peopleModel.getAge());

    }
    */

//  返回显示的items的数量
    @Override
    public int getItemCount() {
        return peopleModelList.size();
    }


}
