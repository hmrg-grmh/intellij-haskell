// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import com.intellij.navigation.ItemPresentation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import scala.Option;
import scala.collection.immutable.Seq;

public interface HaskellDerivingDeclaration extends HaskellTopDeclaration, HaskellDeclarationElement {

  @NotNull
  HaskellInst getInst();

  @NotNull
  HaskellQName getQName();

  @Nullable
  HaskellScontext getScontext();

  String getName();

  ItemPresentation getPresentation();

  Seq<HaskellNamedElement> getIdentifierElements();

  Option<String> getModuleName();

}
