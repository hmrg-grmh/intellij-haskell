// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import intellij.haskell.psi.HaskellVarid;
import intellij.haskell.psi.HaskellVarop;
import intellij.haskell.psi.HaskellVarsym;
import intellij.haskell.psi.HaskellVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HaskellVaropImpl extends HaskellCNameElementImpl implements HaskellVarop {

  public HaskellVaropImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitVarop(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HaskellVarid getVarid() {
    return findChildByClass(HaskellVarid.class);
  }

  @Override
  @Nullable
  public HaskellVarsym getVarsym() {
    return findChildByClass(HaskellVarsym.class);
  }

  public String getName() {
    return HaskellPsiImplUtil.getName(this);
  }

}