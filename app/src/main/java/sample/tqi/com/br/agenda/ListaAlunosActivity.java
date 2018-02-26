package sample.tqi.com.br.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import sample.tqi.com.br.agenda.dao.AlunoDAO;
import sample.tqi.com.br.agenda.modelo.Aluno;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lista_alunos );
        AlunoDAO dao = new AlunoDAO( this );

        List <Aluno> alunos = dao.buscaAlunos();
        dao.close();

        ListView ListaAlunos = findViewById( R.id.lista_alunos );
        ArrayAdapter <Aluno> adapter = new ArrayAdapter <Aluno>( this, android.R.layout.simple_list_item_1, alunos );
        ListaAlunos.setAdapter( adapter );

        Button novoAluno = findViewById( R.id.novo_aluno );
        novoAluno.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent( ListaAlunosActivity.this, FormularioActivity.class );
                startActivity( intent );

            }
        } );

    }
}
