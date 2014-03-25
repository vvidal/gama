/**
 * <copyright>
 * </copyright>
 *
 */
package msi.gama.lang.gaml.gaml.util;

import msi.gama.lang.gaml.gaml.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see msi.gama.lang.gaml.gaml.GamlPackage
 * @generated
 */
public class GamlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GamlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GamlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GamlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GamlPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = caseVarDefinition(model);
        if (result == null) result = caseGamlDefinition(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SDO:
      {
        S_Do s_Do = (S_Do)theEObject;
        T result = caseS_Do(s_Do);
        if (result == null) result = caseStatement(s_Do);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SLOOP:
      {
        S_Loop s_Loop = (S_Loop)theEObject;
        T result = caseS_Loop(s_Loop);
        if (result == null) result = caseS_Declaration(s_Loop);
        if (result == null) result = caseStatement(s_Loop);
        if (result == null) result = caseVarDefinition(s_Loop);
        if (result == null) result = caseGamlDefinition(s_Loop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SIF:
      {
        S_If s_If = (S_If)theEObject;
        T result = caseS_If(s_If);
        if (result == null) result = caseStatement(s_If);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SOTHER:
      {
        S_Other s_Other = (S_Other)theEObject;
        T result = caseS_Other(s_Other);
        if (result == null) result = caseStatement(s_Other);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SRETURN:
      {
        S_Return s_Return = (S_Return)theEObject;
        T result = caseS_Return(s_Return);
        if (result == null) result = caseStatement(s_Return);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SDECLARATION:
      {
        S_Declaration s_Declaration = (S_Declaration)theEObject;
        T result = caseS_Declaration(s_Declaration);
        if (result == null) result = caseStatement(s_Declaration);
        if (result == null) result = caseVarDefinition(s_Declaration);
        if (result == null) result = caseGamlDefinition(s_Declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SSPECIES:
      {
        S_Species s_Species = (S_Species)theEObject;
        T result = caseS_Species(s_Species);
        if (result == null) result = caseS_Declaration(s_Species);
        if (result == null) result = caseTypeDefinition(s_Species);
        if (result == null) result = caseStatement(s_Species);
        if (result == null) result = caseVarDefinition(s_Species);
        if (result == null) result = caseActionDefinition(s_Species);
        if (result == null) result = caseGamlDefinition(s_Species);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SEXPERIMENT:
      {
        S_Experiment s_Experiment = (S_Experiment)theEObject;
        T result = caseS_Experiment(s_Experiment);
        if (result == null) result = caseS_Declaration(s_Experiment);
        if (result == null) result = caseStatement(s_Experiment);
        if (result == null) result = caseVarDefinition(s_Experiment);
        if (result == null) result = caseGamlDefinition(s_Experiment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SREFLEX:
      {
        S_Reflex s_Reflex = (S_Reflex)theEObject;
        T result = caseS_Reflex(s_Reflex);
        if (result == null) result = caseS_Declaration(s_Reflex);
        if (result == null) result = caseStatement(s_Reflex);
        if (result == null) result = caseVarDefinition(s_Reflex);
        if (result == null) result = caseGamlDefinition(s_Reflex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SDEFINITION:
      {
        S_Definition s_Definition = (S_Definition)theEObject;
        T result = caseS_Definition(s_Definition);
        if (result == null) result = caseS_Declaration(s_Definition);
        if (result == null) result = caseActionDefinition(s_Definition);
        if (result == null) result = caseStatement(s_Definition);
        if (result == null) result = caseVarDefinition(s_Definition);
        if (result == null) result = caseGamlDefinition(s_Definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SASSIGNMENT:
      {
        S_Assignment s_Assignment = (S_Assignment)theEObject;
        T result = caseS_Assignment(s_Assignment);
        if (result == null) result = caseStatement(s_Assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SDIRECT_ASSIGNMENT:
      {
        S_DirectAssignment s_DirectAssignment = (S_DirectAssignment)theEObject;
        T result = caseS_DirectAssignment(s_DirectAssignment);
        if (result == null) result = caseS_Assignment(s_DirectAssignment);
        if (result == null) result = caseStatement(s_DirectAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SSET:
      {
        S_Set s_Set = (S_Set)theEObject;
        T result = caseS_Set(s_Set);
        if (result == null) result = caseS_Assignment(s_Set);
        if (result == null) result = caseStatement(s_Set);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SEQUATIONS:
      {
        S_Equations s_Equations = (S_Equations)theEObject;
        T result = caseS_Equations(s_Equations);
        if (result == null) result = caseStatement(s_Equations);
        if (result == null) result = caseEquationDefinition(s_Equations);
        if (result == null) result = caseGamlDefinition(s_Equations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SSOLVE:
      {
        S_Solve s_Solve = (S_Solve)theEObject;
        T result = caseS_Solve(s_Solve);
        if (result == null) result = caseStatement(s_Solve);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SDISPLAY:
      {
        S_Display s_Display = (S_Display)theEObject;
        T result = caseS_Display(s_Display);
        if (result == null) result = caseStatement(s_Display);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SPECIES_OR_GRID_DISPLAY_STATEMENT:
      {
        speciesOrGridDisplayStatement speciesOrGridDisplayStatement = (speciesOrGridDisplayStatement)theEObject;
        T result = casespeciesOrGridDisplayStatement(speciesOrGridDisplayStatement);
        if (result == null) result = caseStatement(speciesOrGridDisplayStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.PARAMETERS:
      {
        Parameters parameters = (Parameters)theEObject;
        T result = caseParameters(parameters);
        if (result == null) result = caseExpression(parameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.ACTION_ARGUMENTS:
      {
        ActionArguments actionArguments = (ActionArguments)theEObject;
        T result = caseActionArguments(actionArguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.ARGUMENT_DEFINITION:
      {
        ArgumentDefinition argumentDefinition = (ArgumentDefinition)theEObject;
        T result = caseArgumentDefinition(argumentDefinition);
        if (result == null) result = caseVarDefinition(argumentDefinition);
        if (result == null) result = caseGamlDefinition(argumentDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.FACET:
      {
        Facet facet = (Facet)theEObject;
        T result = caseFacet(facet);
        if (result == null) result = caseVarDefinition(facet);
        if (result == null) result = caseGamlDefinition(facet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.ARGUMENT_PAIR:
      {
        ArgumentPair argumentPair = (ArgumentPair)theEObject;
        T result = caseArgumentPair(argumentPair);
        if (result == null) result = caseExpression(argumentPair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseExpression(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.EXPRESSION_LIST:
      {
        ExpressionList expressionList = (ExpressionList)theEObject;
        T result = caseExpressionList(expressionList);
        if (result == null) result = caseExpression(expressionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.VARIABLE_REF:
      {
        VariableRef variableRef = (VariableRef)theEObject;
        T result = caseVariableRef(variableRef);
        if (result == null) result = caseExpression(variableRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SPECIES_REF:
      {
        SpeciesRef speciesRef = (SpeciesRef)theEObject;
        T result = caseSpeciesRef(speciesRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.TYPE_INFO:
      {
        TypeInfo typeInfo = (TypeInfo)theEObject;
        T result = caseTypeInfo(typeInfo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.GAML_DEFINITION:
      {
        GamlDefinition gamlDefinition = (GamlDefinition)theEObject;
        T result = caseGamlDefinition(gamlDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.EQUATION_DEFINITION:
      {
        EquationDefinition equationDefinition = (EquationDefinition)theEObject;
        T result = caseEquationDefinition(equationDefinition);
        if (result == null) result = caseGamlDefinition(equationDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = caseActionDefinition(typeDefinition);
        if (result == null) result = caseGamlDefinition(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.VAR_DEFINITION:
      {
        VarDefinition varDefinition = (VarDefinition)theEObject;
        T result = caseVarDefinition(varDefinition);
        if (result == null) result = caseGamlDefinition(varDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.ACTION_DEFINITION:
      {
        ActionDefinition actionDefinition = (ActionDefinition)theEObject;
        T result = caseActionDefinition(actionDefinition);
        if (result == null) result = caseGamlDefinition(actionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.UNIT_FAKE_DEFINITION:
      {
        UnitFakeDefinition unitFakeDefinition = (UnitFakeDefinition)theEObject;
        T result = caseUnitFakeDefinition(unitFakeDefinition);
        if (result == null) result = caseGamlDefinition(unitFakeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.TYPE_FAKE_DEFINITION:
      {
        TypeFakeDefinition typeFakeDefinition = (TypeFakeDefinition)theEObject;
        T result = caseTypeFakeDefinition(typeFakeDefinition);
        if (result == null) result = caseTypeDefinition(typeFakeDefinition);
        if (result == null) result = caseActionDefinition(typeFakeDefinition);
        if (result == null) result = caseGamlDefinition(typeFakeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.ACTION_FAKE_DEFINITION:
      {
        ActionFakeDefinition actionFakeDefinition = (ActionFakeDefinition)theEObject;
        T result = caseActionFakeDefinition(actionFakeDefinition);
        if (result == null) result = caseActionDefinition(actionFakeDefinition);
        if (result == null) result = caseGamlDefinition(actionFakeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SKILL_FAKE_DEFINITION:
      {
        SkillFakeDefinition skillFakeDefinition = (SkillFakeDefinition)theEObject;
        T result = caseSkillFakeDefinition(skillFakeDefinition);
        if (result == null) result = caseGamlDefinition(skillFakeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.VAR_FAKE_DEFINITION:
      {
        VarFakeDefinition varFakeDefinition = (VarFakeDefinition)theEObject;
        T result = caseVarFakeDefinition(varFakeDefinition);
        if (result == null) result = caseVarDefinition(varFakeDefinition);
        if (result == null) result = caseGamlDefinition(varFakeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.EQUATION_FAKE_DEFINITION:
      {
        EquationFakeDefinition equationFakeDefinition = (EquationFakeDefinition)theEObject;
        T result = caseEquationFakeDefinition(equationFakeDefinition);
        if (result == null) result = caseEquationDefinition(equationFakeDefinition);
        if (result == null) result = caseGamlDefinition(equationFakeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.TERMINAL_EXPRESSION:
      {
        TerminalExpression terminalExpression = (TerminalExpression)theEObject;
        T result = caseTerminalExpression(terminalExpression);
        if (result == null) result = caseExpression(terminalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.STRING_EVALUATOR:
      {
        StringEvaluator stringEvaluator = (StringEvaluator)theEObject;
        T result = caseStringEvaluator(stringEvaluator);
        if (result == null) result = caseModel(stringEvaluator);
        if (result == null) result = caseVarDefinition(stringEvaluator);
        if (result == null) result = caseGamlDefinition(stringEvaluator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SACTION:
      {
        S_Action s_Action = (S_Action)theEObject;
        T result = caseS_Action(s_Action);
        if (result == null) result = caseS_Definition(s_Action);
        if (result == null) result = caseS_Declaration(s_Action);
        if (result == null) result = caseActionDefinition(s_Action);
        if (result == null) result = caseStatement(s_Action);
        if (result == null) result = caseVarDefinition(s_Action);
        if (result == null) result = caseGamlDefinition(s_Action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SVAR:
      {
        S_Var s_Var = (S_Var)theEObject;
        T result = caseS_Var(s_Var);
        if (result == null) result = caseS_Definition(s_Var);
        if (result == null) result = caseS_Declaration(s_Var);
        if (result == null) result = caseActionDefinition(s_Var);
        if (result == null) result = caseStatement(s_Var);
        if (result == null) result = caseVarDefinition(s_Var);
        if (result == null) result = caseGamlDefinition(s_Var);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.PAIR:
      {
        Pair pair = (Pair)theEObject;
        T result = casePair(pair);
        if (result == null) result = caseExpression(pair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.IF:
      {
        If if_ = (If)theEObject;
        T result = caseIf(if_);
        if (result == null) result = caseExpression(if_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.CAST:
      {
        Cast cast = (Cast)theEObject;
        T result = caseCast(cast);
        if (result == null) result = caseExpression(cast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.BINARY:
      {
        Binary binary = (Binary)theEObject;
        T result = caseBinary(binary);
        if (result == null) result = caseExpression(binary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.UNIT:
      {
        Unit unit = (Unit)theEObject;
        T result = caseUnit(unit);
        if (result == null) result = caseExpression(unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.UNARY:
      {
        Unary unary = (Unary)theEObject;
        T result = caseUnary(unary);
        if (result == null) result = caseExpression(unary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.ACCESS:
      {
        Access access = (Access)theEObject;
        T result = caseAccess(access);
        if (result == null) result = caseExpression(access);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.DOT:
      {
        Dot dot = (Dot)theEObject;
        T result = caseDot(dot);
        if (result == null) result = caseExpression(dot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.ARRAY:
      {
        Array array = (Array)theEObject;
        T result = caseArray(array);
        if (result == null) result = caseExpression(array);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.POINT:
      {
        Point point = (Point)theEObject;
        T result = casePoint(point);
        if (result == null) result = caseExpression(point);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseExpression(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.UNIT_NAME:
      {
        UnitName unitName = (UnitName)theEObject;
        T result = caseUnitName(unitName);
        if (result == null) result = caseExpression(unitName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.TYPE_REF:
      {
        TypeRef typeRef = (TypeRef)theEObject;
        T result = caseTypeRef(typeRef);
        if (result == null) result = caseExpression(typeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.SKILL_REF:
      {
        SkillRef skillRef = (SkillRef)theEObject;
        T result = caseSkillRef(skillRef);
        if (result == null) result = caseExpression(skillRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.ACTION_REF:
      {
        ActionRef actionRef = (ActionRef)theEObject;
        T result = caseActionRef(actionRef);
        if (result == null) result = caseExpression(actionRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.EQUATION_REF:
      {
        EquationRef equationRef = (EquationRef)theEObject;
        T result = caseEquationRef(equationRef);
        if (result == null) result = caseExpression(equationRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.INT_LITERAL:
      {
        IntLiteral intLiteral = (IntLiteral)theEObject;
        T result = caseIntLiteral(intLiteral);
        if (result == null) result = caseTerminalExpression(intLiteral);
        if (result == null) result = caseExpression(intLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.DOUBLE_LITERAL:
      {
        DoubleLiteral doubleLiteral = (DoubleLiteral)theEObject;
        T result = caseDoubleLiteral(doubleLiteral);
        if (result == null) result = caseTerminalExpression(doubleLiteral);
        if (result == null) result = caseExpression(doubleLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.COLOR_LITERAL:
      {
        ColorLiteral colorLiteral = (ColorLiteral)theEObject;
        T result = caseColorLiteral(colorLiteral);
        if (result == null) result = caseTerminalExpression(colorLiteral);
        if (result == null) result = caseExpression(colorLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseTerminalExpression(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseTerminalExpression(booleanLiteral);
        if (result == null) result = caseExpression(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GamlPackage.RESERVED_LITERAL:
      {
        ReservedLiteral reservedLiteral = (ReservedLiteral)theEObject;
        T result = caseReservedLiteral(reservedLiteral);
        if (result == null) result = caseTerminalExpression(reservedLiteral);
        if (result == null) result = caseExpression(reservedLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SDo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SDo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Do(S_Do object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SLoop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SLoop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Loop(S_Loop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SIf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SIf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_If(S_If object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SOther</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SOther</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Other(S_Other object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SReturn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SReturn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Return(S_Return object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SDeclaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SDeclaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Declaration(S_Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SSpecies</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SSpecies</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Species(S_Species object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SExperiment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SExperiment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Experiment(S_Experiment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SReflex</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SReflex</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Reflex(S_Reflex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SDefinition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SDefinition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Definition(S_Definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SAssignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SAssignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Assignment(S_Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SDirect Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SDirect Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_DirectAssignment(S_DirectAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SSet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SSet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Set(S_Set object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SEquations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SEquations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Equations(S_Equations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SSolve</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SSolve</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Solve(S_Solve object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SDisplay</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SDisplay</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Display(S_Display object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>species Or Grid Display Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>species Or Grid Display Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casespeciesOrGridDisplayStatement(speciesOrGridDisplayStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameters(Parameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionArguments(ActionArguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgumentDefinition(ArgumentDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacet(Facet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgumentPair(ArgumentPair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionList(ExpressionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableRef(VariableRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Species Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Species Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpeciesRef(SpeciesRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeInfo(TypeInfo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGamlDefinition(GamlDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equation Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equation Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquationDefinition(EquationDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDefinition(TypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarDefinition(VarDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionDefinition(ActionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Fake Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Fake Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitFakeDefinition(UnitFakeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Fake Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Fake Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeFakeDefinition(TypeFakeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Fake Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Fake Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionFakeDefinition(ActionFakeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Skill Fake Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Skill Fake Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSkillFakeDefinition(SkillFakeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Fake Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Fake Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarFakeDefinition(VarFakeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equation Fake Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equation Fake Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquationFakeDefinition(EquationFakeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminalExpression(TerminalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Evaluator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Evaluator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringEvaluator(StringEvaluator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SAction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SAction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Action(S_Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SVar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SVar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS_Var(S_Var object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePair(Pair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIf(If object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCast(Cast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinary(Binary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnit(Unit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnary(Unary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccess(Access object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDot(Dot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray(Array object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint(Point object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitName(UnitName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeRef(TypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Skill Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Skill Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSkillRef(SkillRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionRef(ActionRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equation Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equation Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquationRef(EquationRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLiteral(IntLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleLiteral(DoubleLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorLiteral(ColorLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reserved Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reserved Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReservedLiteral(ReservedLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GamlSwitch
