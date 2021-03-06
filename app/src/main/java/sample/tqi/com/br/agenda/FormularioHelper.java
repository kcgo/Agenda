package sample.tqi.com.br.agenda;

import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;

import sample.tqi.com.br.agenda.modelo.Aluno;

/**
 * Created by katia.goncalves on 22/02/2018.
 */

public class FormularioHelper {
    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoTelefone;
    private final EditText campoSite;
    private final RatingBar campoNota;

    public FormularioHelper( FormularioActivity activity ) {
         campoNome = activity.findViewById( R.id.formulario_nome );
         campoEndereco = activity.findViewById( R.id.formulario_endereco );
         campoTelefone = activity.findViewById( R.id.formulario_telefone );
         campoSite = activity.findViewById( R.id.formulario_site );
         campoNota = activity.findViewById( R.id.formulario_nota );
    }

    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome( campoNome.getText().toString() );
        aluno.setEndereco( campoEndereco.getText().toString() );
        aluno.setTelefone( campoTelefone.getText().toString() );
        aluno.setSite( campoSite.getText().toString() );
        aluno.setNota( (double) campoNota.getProgress() );


        return aluno;
    }
}
