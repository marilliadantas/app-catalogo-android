package com.example.apploja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdaptadorProdutos extends ArrayAdapter<Produto> {

    private Context contexto;
    private List<Produto> listaProdutos;

    public AdaptadorProdutos(@NonNull Context context, @NonNull List<Produto> produtos) {
        super(context, 0, produtos);
        this.contexto = context;
        this.listaProdutos = produtos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        ViewHolder holder;

        if (view == null) {
            view = LayoutInflater.from(contexto).inflate(R.layout.item_produto, parent, false);
            holder = new ViewHolder();
            holder.imagemProduto = view.findViewById(R.id.imagem_produto);
            holder.nomeProduto = view.findViewById(R.id.nome_produto);
            holder.descricaoProduto = view.findViewById(R.id.descricao_produto);
            holder.precoProduto = view.findViewById(R.id.preco_produto);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        Produto produto = listaProdutos.get(position);
        holder.imagemProduto.setImageResource(produto.getImagem());
        holder.nomeProduto.setText(produto.getNome());
        holder.descricaoProduto.setText(produto.getDescricao());
        holder.precoProduto.setText(produto.getPreco());

        return view;
    }

    static class ViewHolder {
        ImageView imagemProduto;
        TextView nomeProduto;
        TextView descricaoProduto;
        TextView precoProduto;
    }
}